package com.farm.edu.persistency.repository;

import com.farm.edu.persistency.entity.GoodWorkerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GoodWorkerRepository extends CrudRepository<GoodWorkerEntity,Long> {
    List<GoodWorkerEntity> findByType(String type);
    List<GoodWorkerEntity> findAll();
    List<GoodWorkerEntity> deleteById(long id);
    GoodWorkerEntity findById(long id);
}
