package com.farm.edu.service;

import com.farm.edu.controller.model.LazyWorkerModel;
import com.farm.edu.persistency.entity.LazyWorkerEntity;
import com.farm.edu.persistency.repository.LazyWorkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultLazyWorkerService implements LazyWorkerService  {
    private final LazyWorkerRepository lazyWorkerRepository;

    public DefaultLazyWorkerService(LazyWorkerRepository lazyWorkerRepository) {

        this.lazyWorkerRepository = lazyWorkerRepository;
    }
    @Override
    public LazyWorkerEntity create(LazyWorkerModel lazyWorkerModel) {
        return this.lazyWorkerRepository
                .save(new LazyWorkerEntity(
                        lazyWorkerModel.getFirstName(),
                        lazyWorkerModel.getLastName(),
                        lazyWorkerModel.getWorkHour()));}

    @Override
    public LazyWorkerEntity findLazyWorker(Long id) {
        return this.lazyWorkerRepository.findById(id).get();}

    @Override
    public List<LazyWorkerEntity> getListOfLazyWorkers() {
        return (List<LazyWorkerEntity>) this.lazyWorkerRepository.findAll();
    }

    @Override
    public void deleteLazyWorker(Long id) {
        this.lazyWorkerRepository.deleteById(id);
    }

    @Override
    public LazyWorkerEntity save(LazyWorkerEntity lazyWorkerModel) {
        return this.lazyWorkerRepository
                .save(lazyWorkerModel);}

    @Override
    public void setWorkHour(int workHour) {

    }
}
