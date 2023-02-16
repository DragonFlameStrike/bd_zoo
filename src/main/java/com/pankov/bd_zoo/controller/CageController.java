package com.pankov.bd_zoo.controller;

import com.pankov.bd_zoo.model.Cage;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController()
@RequestMapping("/Zoo/cages")
public class CageController {
    @GetMapping(value = "/{id}",produces = "application/json")
    public @ResponseBody Cage getCage(@PathVariable int id) {
        return findCageById(id);
    }

    private Cage findCageById(int id) {
        return new Cage(id);
    }
}
