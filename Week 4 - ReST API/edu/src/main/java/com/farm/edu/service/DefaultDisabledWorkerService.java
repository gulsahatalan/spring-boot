package com.farm.edu.service;

import com.farm.edu.controller.model.DisabledWorkerModel;
import com.farm.edu.persistency.entity.DisabledWorkerEntity;
import com.farm.edu.persistency.repository.DisabledWorkerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DefaultDisabledWorkerService implements DisabledWorkerService {
    private final DisabledWorkerRepository disabledWorkerRepository;

    public DefaultDisabledWorkerService(DisabledWorkerRepository disabledWorkerRepository) {

        this.disabledWorkerRepository = disabledWorkerRepository;
    }

    @Override
    public DisabledWorkerEntity create(DisabledWorkerModel disabledWorkerModel) {

        return this.disabledWorkerRepository
                .save(new DisabledWorkerEntity(
                        disabledWorkerModel.getFirstName(),
                        disabledWorkerModel.getLastName(),
                        disabledWorkerModel.getWorkHour()));}
    @Override
    public DisabledWorkerEntity findDisabledWorker(Long id){

        return this.disabledWorkerRepository.findById(id).get();}

    @Override
    public List<DisabledWorkerEntity> getListOfDisabledWorkers() {

        return (List<DisabledWorkerEntity>) this.disabledWorkerRepository.findAll();
    }

    @Override
    public void deleteDisabledWorker(Long id) {
        this.disabledWorkerRepository.deleteById(id);
    }

    @Override
    public DisabledWorkerEntity save(DisabledWorkerEntity disabledWorkerModel) {
        return this.disabledWorkerRepository
                .save(disabledWorkerModel);}

    @Override
    public void setWorkHour(int workHour) {
    }

}
