package com.farm.edu.controller;

import com.farm.edu.controller.model.GoodWorkerModel;
import com.farm.edu.persistency.entity.GoodWorkerEntity;
import com.farm.edu.service.GoodWorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goodWorkers")
public class GoodWorkerController {
    private final GoodWorkerService goodWorkerService;

    public GoodWorkerController(GoodWorkerService goodWorkerService) {
        this.goodWorkerService = goodWorkerService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GoodWorkerEntity>> getListOfGoodWorkers(){
        List<GoodWorkerEntity> goodWorkerEntityList = this.goodWorkerService.getListOfGoodWorkers();

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(goodWorkerEntityList);
    }

    @PostMapping
    public ResponseEntity  createAGoodWorker(@RequestBody GoodWorkerModel goodWorkerModel){
        GoodWorkerEntity newGoodWorkerEntity =this.goodWorkerService.create(goodWorkerModel);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newGoodWorkerEntity);
    }

    @GetMapping("/{id}")
    public ResponseEntity <GoodWorkerEntity>getGoodWorkerById(@PathVariable("id") Long id){
        GoodWorkerEntity existingGoodWorkerEntity= this.goodWorkerService.findGoodWorker(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(existingGoodWorkerEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteGoodWorkerById(@PathVariable("id") Long id){
        this.goodWorkerService.deleteGoodWorker(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @PutMapping ("/{id}")
    public ResponseEntity updateWorkerHourById(
            @PathVariable("id") Long id,
            @RequestBody GoodWorkerEntity goodWorkerEntity
    ){
        goodWorkerEntity.setWorkHour(goodWorkerEntity.getWorkHour());
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(goodWorkerEntity);
    }

}
