package com.farm.edu.service;

import com.farm.edu.controller.model.ChildWorkerModel;
import com.farm.edu.persistency.entity.ChildWorkerEntity;

import java.util.List;

public interface ChildWorkerService {

    ChildWorkerEntity create(ChildWorkerModel childWorkerModel);

    ChildWorkerEntity findChildWorker(Long id);

    List<ChildWorkerEntity> getListOfChildWorkers();

    void deleteChildWorker(Long id);

    ChildWorkerEntity save(ChildWorkerEntity childWorkerEntity);

    void setWorkHour(int workHour);

}
