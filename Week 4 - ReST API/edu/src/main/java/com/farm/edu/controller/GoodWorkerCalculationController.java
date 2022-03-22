package com.farm.edu.controller;

import com.farm.edu.persistency.entity.GoodWorkerEntity;
import com.farm.edu.service.CalculationService;
import com.farm.edu.service.GoodWorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goodWorkerSalaries")
public class GoodWorkerCalculationController {
    private GoodWorkerService goodWorkerService;
    private CalculationService calculationService;

    public GoodWorkerCalculationController(CalculationService calculationService, GoodWorkerService goodWorkerService){
        this.calculationService = calculationService;
        this.goodWorkerService= goodWorkerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Integer> getAWorkerTotalSalaryById(
            @PathVariable("id") Long id) {
        GoodWorkerEntity existingGoodWorkerEntity= this.goodWorkerService.findGoodWorker(id);
        int workerTotalSalary = calculationService.totalSalary(existingGoodWorkerEntity);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(workerTotalSalary);
    }

}
