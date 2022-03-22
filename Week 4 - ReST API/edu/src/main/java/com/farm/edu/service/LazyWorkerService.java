package com.farm.edu.service;

import com.farm.edu.controller.model.LazyWorkerModel;
import com.farm.edu.persistency.entity.LazyWorkerEntity;

import java.util.List;

public interface LazyWorkerService {
    LazyWorkerEntity create(LazyWorkerModel lazyWorkerModel);

    LazyWorkerEntity findLazyWorker(Long id);

    List<LazyWorkerEntity> getListOfLazyWorkers();

    void deleteLazyWorker(Long id);

    LazyWorkerEntity save(LazyWorkerEntity lazyWorkerModel);

    void setWorkHour(int workHour);
}
