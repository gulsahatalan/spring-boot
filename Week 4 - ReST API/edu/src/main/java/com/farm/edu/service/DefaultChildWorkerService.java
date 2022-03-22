package com.farm.edu.service;

import com.farm.edu.controller.model.ChildWorkerModel;
import com.farm.edu.persistency.entity.ChildWorkerEntity;
import com.farm.edu.persistency.repository.ChildWorkerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DefaultChildWorkerService implements ChildWorkerService{

    private final ChildWorkerRepository childWorkerRepository;

    public DefaultChildWorkerService(ChildWorkerRepository childWorkerRepository) {

        this.childWorkerRepository = childWorkerRepository;
    }

    @Override
    public ChildWorkerEntity create(ChildWorkerModel childWorkerModel) {

        return this.childWorkerRepository
                .save(new ChildWorkerEntity(
                        childWorkerModel.getFirstName(),
                        childWorkerModel.getLastName(),
                        childWorkerModel.getWorkHour()));}
    @Override
    public ChildWorkerEntity findChildWorker(Long id){

        return this.childWorkerRepository.findById(id).get();}

    @Override
    public List<ChildWorkerEntity> getListOfChildWorkers() {

        return (List<ChildWorkerEntity>) this.childWorkerRepository.findAll();
    }

    @Override
    public void deleteChildWorker(Long id) {
        this.childWorkerRepository.deleteById(id);
    }

    @Override
    public ChildWorkerEntity save(ChildWorkerEntity childWorkerModel) {
        return this.childWorkerRepository
                .save(new ChildWorkerEntity(
                        childWorkerModel.getWorkHour()));}

    @Override
    public void setWorkHour(int workHour) {
    }

    }




