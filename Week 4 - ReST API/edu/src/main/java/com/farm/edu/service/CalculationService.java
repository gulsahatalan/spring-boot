package com.farm.edu.service;

import com.farm.edu.persistency.entity.ChildWorkerEntity;
import com.farm.edu.persistency.entity.DisabledWorkerEntity;
import com.farm.edu.persistency.entity.GoodWorkerEntity;
import com.farm.edu.persistency.entity.LazyWorkerEntity;

public interface CalculationService {
    int totalSalary(ChildWorkerEntity childWorkerEntity);
    int totalSalary(DisabledWorkerEntity disabledWorkerEntity);
    int totalSalary(GoodWorkerEntity goodWorkerEntity);
    int totalSalary(LazyWorkerEntity lazyWorkerEntity);
}


