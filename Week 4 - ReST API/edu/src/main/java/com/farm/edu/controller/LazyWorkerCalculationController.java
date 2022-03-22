package com.farm.edu.controller;

import com.farm.edu.persistency.entity.LazyWorkerEntity;
import com.farm.edu.service.CalculationService;
import com.farm.edu.service.LazyWorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lazyWorkerSalaries")
public class LazyWorkerCalculationController {
    private LazyWorkerService lazyWorkerService;
    private CalculationService calculationService;

    public LazyWorkerCalculationController(CalculationService calculationService, LazyWorkerService lazyWorkerService){
        this.calculationService = calculationService;
        this.lazyWorkerService= lazyWorkerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Integer> getAWorkerTotalSalaryById(
            @PathVariable("id") Long id) {
        LazyWorkerEntity existingLazyWorkerEntity= this.lazyWorkerService.findLazyWorker(id);
        int workerTotalSalary = calculationService.totalSalary(existingLazyWorkerEntity);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(workerTotalSalary);
    }

}
