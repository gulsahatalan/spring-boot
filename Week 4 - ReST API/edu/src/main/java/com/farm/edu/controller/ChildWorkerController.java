package com.farm.edu.controller;

import com.farm.edu.controller.model.ChildWorkerModel;
import com.farm.edu.persistency.entity.ChildWorkerEntity;
import com.farm.edu.service.ChildWorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/childWorkers")
public class ChildWorkerController {
    private final ChildWorkerService childWorkerService;

    public ChildWorkerController(ChildWorkerService childWorkerService) {
        this.childWorkerService = childWorkerService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ChildWorkerEntity>> getListOfChildWorkers(){
        List<ChildWorkerEntity> childWorkerEntityList = this.childWorkerService.getListOfChildWorkers();

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(childWorkerEntityList);
    }

    @PostMapping
    public ResponseEntity  createAChildWorker(@RequestBody ChildWorkerModel childWorkerModel){
        System.out.println("create a new Child worker" + childWorkerModel);
        ChildWorkerEntity newChildWorkerEntity =this.childWorkerService.create(childWorkerModel);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newChildWorkerEntity);
    }

    @GetMapping("/{id}")
    public ResponseEntity <ChildWorkerEntity>getChildWorkerById(@PathVariable("id") Long id){
       ChildWorkerEntity existingChildWorkerEntity= this.childWorkerService.findChildWorker(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(existingChildWorkerEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteChildWorkerById(@PathVariable("id") Long id){
        this.childWorkerService.deleteChildWorker(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PutMapping ("/{id}")
    public ResponseEntity updateWorkerHourById(
            @PathVariable("id") Long id,
            @RequestBody ChildWorkerEntity childWorkerEntity
    ){
        childWorkerEntity.setWorkHour(childWorkerEntity.getWorkHour());
        this.childWorkerService.save(childWorkerEntity);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(childWorkerEntity);
    }

}

