package com.pankov.bd_zoo.component.worker;

import com.pankov.bd_zoo.component.Exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService{
    @Autowired
    private WorkerRepository workerRepository;

    public List<Worker> getAllWorkers() {
        return (List<Worker>) workerRepository.findAll();
    }
    public Worker getWorkerById(Long id) {
        Optional<Worker> workerOptional = workerRepository.findById(id);
        if (workerOptional.isPresent()) {
            return workerOptional.get();
        } else {
            throw new NotFoundException("Worker not found");
        }
    }
    public void addWorker(Worker worker) {
        workerRepository.save(worker);
    }
    public void updateWorker(Long id, Worker worker) {
        Optional<Worker> workerOptional = workerRepository.findById(id);
        if (workerOptional.isPresent()) {
            worker.setId(id);
            workerRepository.save(worker);
        } else {
            throw new NotFoundException("Worker not found");
        }
    }
    public void deleteWorkerById(Long id) {
        workerRepository.deleteById(id);
    }
}
