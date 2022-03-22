package com.farm.edu.controller;

import com.farm.edu.persistency.entity.ChildWorkerEntity;
import com.farm.edu.service.CalculationService;
import com.farm.edu.service.ChildWorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/childWorkerSalaries")

public class ChildWorkerCalculationController {
    private  ChildWorkerService childWorkerService;
    private CalculationService calculationService;

    public ChildWorkerCalculationController(CalculationService calculationService, ChildWorkerService childWorkerService){
        this.calculationService = calculationService;
        this.childWorkerService= childWorkerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Integer> getAWorkerTotalSalaryById(
            @PathVariable("id") Long id) {
        ChildWorkerEntity existingChildWorkerEntity= this.childWorkerService.findChildWorker(id);
        int workerTotalSalary = calculationService.totalSalary(existingChildWorkerEntity);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(workerTotalSalary);
    }

}
