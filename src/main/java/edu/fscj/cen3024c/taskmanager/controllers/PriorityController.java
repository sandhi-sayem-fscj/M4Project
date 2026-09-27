package edu.fscj.cen3024c.taskmanager.controllers;

import edu.fscj.cen3024c.taskmanager.entities.Priority;
import edu.fscj.cen3024c.taskmanager.services.PriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/priorities")
public class PriorityController {

    @Autowired
    private PriorityService priorityService;

    // READ ONLY
    @GetMapping
    public List<Priority> getAllPriorities() {
        return priorityService.findAll();
    }

    @GetMapping("/{id}")
    public Priority getPriorityById(@PathVariable Integer id) {
        return priorityService.findById(id);
    }
}
