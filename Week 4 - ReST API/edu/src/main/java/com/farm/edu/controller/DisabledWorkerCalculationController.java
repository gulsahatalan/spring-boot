package com.farm.edu.controller;

import com.farm.edu.persistency.entity.DisabledWorkerEntity;
import com.farm.edu.service.CalculationService;
import com.farm.edu.service.DisabledWorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/disabledWorkerSalaries")
public class DisabledWorkerCalculationController {
    private DisabledWorkerService disabledWorkerService;
    private CalculationService calculationService;

    public DisabledWorkerCalculationController(CalculationService calculationService, DisabledWorkerService disabledWorkerService){
        this.calculationService = calculationService;
        this.disabledWorkerService= disabledWorkerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Integer> getAWorkerTotalSalaryById(
            @PathVariable("id") Long id) {
        DisabledWorkerEntity existingDisabledWorkerEntity= this.disabledWorkerService.findDisabledWorker(id);
        int workerTotalSalary = calculationService.totalSalary(existingDisabledWorkerEntity);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(workerTotalSalary);
    }

}
