package com.victhugo.board.service;

import com.victhugo.board.dto.TaskDTO;
import com.victhugo.board.model.Task;
import com.victhugo.board.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> findAll() {
        return repository.findAll();
    }

    public Task create(TaskDTO dto) {
        Task task = new Task();
        task.setTitle(dto.getTitle());
        task.setDescription(dto.getDescription());
        task.setCompleted(false);
        return repository.save(task);
    }

    public Task markAsCompleted(Long id) {
        Task task = repository.findById(id).orElseThrow();
        task.setCompleted(true);
        return repository.save(task);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
