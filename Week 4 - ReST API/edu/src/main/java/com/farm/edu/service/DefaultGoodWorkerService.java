package com.farm.edu.service;

import com.farm.edu.controller.model.GoodWorkerModel;
import com.farm.edu.persistency.entity.GoodWorkerEntity;
import com.farm.edu.persistency.repository.GoodWorkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultGoodWorkerService implements GoodWorkerService {
    private final GoodWorkerRepository goodWorkerRepository;

    public DefaultGoodWorkerService(GoodWorkerRepository goodWorkerRepository) {

        this.goodWorkerRepository = goodWorkerRepository;
    }
    @Override
    public GoodWorkerEntity create(GoodWorkerModel goodWorkerModel) {
        return this.goodWorkerRepository
                .save(new GoodWorkerEntity(
                        goodWorkerModel.getFirstName(),
                        goodWorkerModel.getLastName(),
                        goodWorkerModel.getWorkHour()));}

    @Override
    public GoodWorkerEntity findGoodWorker(Long id) {
        return this.goodWorkerRepository.findById(id).get();}

    @Override
    public List<GoodWorkerEntity> getListOfGoodWorkers() {
        return (List<GoodWorkerEntity>) this.goodWorkerRepository.findAll();
    }

    @Override
    public void deleteGoodWorker(Long id) {
        this.goodWorkerRepository.deleteById(id);
    }

    @Override
    public GoodWorkerEntity save(GoodWorkerEntity goodWorkerModel) {
        return this.goodWorkerRepository
                .save(goodWorkerModel);}

    @Override
    public void setWorkHour(int workHour) {}
}
