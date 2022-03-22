package com.farm.edu.persistency.repository;

import com.farm.edu.persistency.entity.LazyWorkerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LazyWorkerRepository extends CrudRepository<LazyWorkerEntity,Long> {
    List<LazyWorkerEntity> findByType(String type);
    List<LazyWorkerEntity> findAll();
    List<LazyWorkerEntity> deleteById(long id);
    LazyWorkerEntity findById(long id);

}
