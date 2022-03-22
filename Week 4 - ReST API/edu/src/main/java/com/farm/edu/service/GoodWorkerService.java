package com.farm.edu.service;

import com.farm.edu.controller.model.GoodWorkerModel;
import com.farm.edu.persistency.entity.GoodWorkerEntity;

import java.util.List;

public interface GoodWorkerService {
    GoodWorkerEntity create(GoodWorkerModel goodWorkerModel);

    GoodWorkerEntity findGoodWorker(Long id);

    List<GoodWorkerEntity> getListOfGoodWorkers();

    void deleteGoodWorker(Long id);

    GoodWorkerEntity save(GoodWorkerEntity goodWorkerModel);

    void setWorkHour(int workHour);
}
