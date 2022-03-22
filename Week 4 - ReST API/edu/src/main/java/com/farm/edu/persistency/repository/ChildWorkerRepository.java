package com.farm.edu.persistency.repository;

import com.farm.edu.persistency.entity.ChildWorkerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChildWorkerRepository extends CrudRepository<ChildWorkerEntity,Long> {
    List<ChildWorkerEntity> findByType(String type);
    List<ChildWorkerEntity> findAll();
    List<ChildWorkerEntity> deleteById(long id);
    ChildWorkerEntity findById(long id);
}
