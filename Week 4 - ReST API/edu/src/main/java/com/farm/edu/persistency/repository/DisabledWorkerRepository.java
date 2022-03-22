package com.farm.edu.persistency.repository;

import com.farm.edu.persistency.entity.DisabledWorkerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DisabledWorkerRepository extends CrudRepository<DisabledWorkerEntity,Long> {
    List<DisabledWorkerEntity> findByType(String type);
    List<DisabledWorkerEntity> findAll();
    List<DisabledWorkerEntity> deleteById(long id);
    DisabledWorkerEntity findById(long id);
}
