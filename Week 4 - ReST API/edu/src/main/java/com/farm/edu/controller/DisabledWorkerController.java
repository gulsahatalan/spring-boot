package com.farm.edu.controller;

import com.farm.edu.controller.model.DisabledWorkerModel;
import com.farm.edu.persistency.entity.DisabledWorkerEntity;
import com.farm.edu.service.DisabledWorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disabledWorkers")
public class DisabledWorkerController {
    private final DisabledWorkerService disabledWorkerService;

    public DisabledWorkerController(DisabledWorkerService disabledWorkerService) {
        this.disabledWorkerService = disabledWorkerService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DisabledWorkerEntity>> getListOfDisabledWorkers(){
        List<DisabledWorkerEntity> disabledWorkerEntityList = this.disabledWorkerService.getListOfDisabledWorkers();

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(disabledWorkerEntityList);
    }

    @PostMapping
    public ResponseEntity  createADisabledWorker(@RequestBody DisabledWorkerModel disabledWorkerModel){
        DisabledWorkerEntity newDisabledWorkerEntity =this.disabledWorkerService.create(disabledWorkerModel);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newDisabledWorkerEntity);
    }

    @GetMapping("/{id}")
    public ResponseEntity <DisabledWorkerEntity>getDisabledWorkerById(@PathVariable("id") Long id){
        DisabledWorkerEntity existingDisabledWorkerEntity= this.disabledWorkerService.findDisabledWorker(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(existingDisabledWorkerEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteDisabledWorkerById(@PathVariable("id") Long id){
        this.disabledWorkerService.deleteDisabledWorker(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PutMapping ("/{id}")
    public ResponseEntity updateWorkerHourById(
            @PathVariable("id") Long id,
            @RequestBody DisabledWorkerEntity disabledWorkerEntity
    ){
        disabledWorkerEntity.setWorkHour(disabledWorkerEntity.getWorkHour());
        this.disabledWorkerService.save(disabledWorkerEntity);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(disabledWorkerEntity);
    }


}
