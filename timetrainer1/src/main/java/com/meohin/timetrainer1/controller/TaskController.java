package com.meohin.timetrainer1.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meohin.timetrainer1.entity.Task;
import com.meohin.timetrainer1.service.TaskService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/task")
public class TaskController {

    private final TaskService taskService;
    
    @GetMapping("/list")
    public String list(Model model) {
        List<Task> taskList = taskService.getTaskList();
        model.addAttribute("task_list", taskList);
        return "/task/task_list";
    }
}
