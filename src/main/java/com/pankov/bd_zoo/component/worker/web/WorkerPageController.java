package com.pankov.bd_zoo.component.worker.web;


import com.pankov.bd_zoo.component.worker.Worker;
import com.pankov.bd_zoo.component.worker.WorkerRepository;
import com.pankov.bd_zoo.component.worker.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/Zoo/workers")
public class WorkerPageController {
    @Autowired
    private WorkerService workerService;

    @GetMapping("/")
    public ModelAndView listWorkers() {
        List<Worker> workers = workerService.getAllWorkers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("workers", workers);
        modelAndView.setViewName("workers");
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView getWorker(@PathVariable Long id) {
        Worker worker = workerService.getWorkerById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("worker", worker);
        modelAndView.setViewName("workers");
        return modelAndView;
    }

    @PostMapping("/")
    public String addWorker(@ModelAttribute("worker") Worker worker) {
        workerService.addWorker(worker);
        return "redirect:/Zoo/workers/";
    }

    @PutMapping("/{id}")
    public String updateWorker(@PathVariable Long id, @ModelAttribute("worker") Worker worker) {
        workerService.updateWorker(id, worker);
        return "redirect:/Zoo/workers/";
    }

    @DeleteMapping("/{id}")
    public String deleteWorker(@PathVariable Long id) {
        workerService.deleteWorkerById(id);
        return "redirect:/Zoo/workers/";
    }
}
