package com.farm.edu.service;

import com.farm.edu.controller.model.DisabledWorkerModel;
import com.farm.edu.persistency.entity.DisabledWorkerEntity;

import java.util.List;

public interface DisabledWorkerService {

    DisabledWorkerEntity create(DisabledWorkerModel disabledWorkerModel);

    DisabledWorkerEntity findDisabledWorker(Long id);

    List<DisabledWorkerEntity> getListOfDisabledWorkers();

    void deleteDisabledWorker(Long id);

    DisabledWorkerEntity save(DisabledWorkerEntity disabledWorkerModel);

    void setWorkHour(int workHour);
}
