package com.meohin.timetrainer1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.meohin.timetrainer1.entity.Task;
import com.meohin.timetrainer1.repository.TaskRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TaskService {
    
    private final TaskRepository taskRepository;

    public List<Task> getTaskList() {
        List<Task> taskList = taskRepository.findAll();
        return taskList;
    }
}
