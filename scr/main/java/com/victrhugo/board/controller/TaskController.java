package com.victhugo.board.controller;

import com.victhugo.board.dto.TaskDTO;
import com.victhugo.board.model.Task;
import com.victhugo.board.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Task create(@RequestBody TaskDTO dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}/complete")
    public Task complete(@PathVariable Long id) {
        return service.markAsCompleted(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
