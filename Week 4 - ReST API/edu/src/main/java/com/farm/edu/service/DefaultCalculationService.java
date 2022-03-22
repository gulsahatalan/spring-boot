package com.farm.edu.service;

import com.farm.edu.persistency.entity.ChildWorkerEntity;
import com.farm.edu.persistency.entity.DisabledWorkerEntity;
import com.farm.edu.persistency.entity.GoodWorkerEntity;
import com.farm.edu.persistency.entity.LazyWorkerEntity;
import org.springframework.stereotype.Service;

@Service
public class DefaultCalculationService implements CalculationService{
    static final int UPPER_LIMIT = 40;
    @Override
    public int totalSalary(ChildWorkerEntity childWorkerEntity) {
        int salary= childWorkerEntity.getWorkHour()*childWorkerEntity.getCostPerHour();

        return salary;
    }

    @Override
    public int totalSalary(DisabledWorkerEntity disabledWorkerEntity) {
        int salary= disabledWorkerEntity.getWorkHour()*disabledWorkerEntity.getCostPerHour();
        return salary;
    }

    @Override
    public int totalSalary(GoodWorkerEntity goodWorkerEntity) {
        int salary= goodWorkerEntity.getWorkHour()*goodWorkerEntity.getCostPerHour();
        return salary;
    }

    @Override
    public int totalSalary(LazyWorkerEntity lazyWorkerEntity) {
        int salary= lazyWorkerEntity.getWorkHour()*lazyWorkerEntity.getCostPerHour();
        return salary;
    }


}
