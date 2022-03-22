package com.farm.edu.controller;

import com.farm.edu.controller.model.LazyWorkerModel;
import com.farm.edu.persistency.entity.LazyWorkerEntity;
import com.farm.edu.service.LazyWorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lazyWorkers")
public class LazyWorkerController {
    private final LazyWorkerService lazyWorkerService;

    public LazyWorkerController(LazyWorkerService lazyWorkerService) {
        this.lazyWorkerService = lazyWorkerService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<LazyWorkerEntity>> getListOfLazyWorkers(){
        List<LazyWorkerEntity> lazyWorkerEntityList = this.lazyWorkerService.getListOfLazyWorkers();

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(lazyWorkerEntityList);
    }

    @PostMapping
    public ResponseEntity  createALazyWorker(@RequestBody LazyWorkerModel lazyWorkerModel){
        LazyWorkerEntity newLazyWorkerEntity =this.lazyWorkerService.create(lazyWorkerModel);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newLazyWorkerEntity);
    }

    @GetMapping("/{id}")
    public ResponseEntity <LazyWorkerEntity>getLazyWorkerById(@PathVariable("id") Long id){
        LazyWorkerEntity existingLazyWorkerEntity= this.lazyWorkerService.findLazyWorker(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(existingLazyWorkerEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteLazyWorkerById(@PathVariable("id") Long id){
        this.lazyWorkerService.deleteLazyWorker(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PutMapping ("/{id}")
    public ResponseEntity updateWorkerHourById(
            @PathVariable("id") Long id,
            @RequestBody LazyWorkerEntity lazyWorkerEntity
    ){
        lazyWorkerEntity.setWorkHour(lazyWorkerEntity.getWorkHour());
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(lazyWorkerEntity);
    }
}
