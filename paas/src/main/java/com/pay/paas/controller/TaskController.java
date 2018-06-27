package com.pay.paas.controller;

import com.pay.paas.common.bean.ResultBean;
import com.pay.paas.entity.Task;
import com.pay.paas.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/list")
    public ResultBean<?> listTask(){
        ResultBean<Object> result = new ResultBean<>();
        result.setData(taskService.listTask());
        return result;
    }

    @PostMapping("/add")
    public ResultBean<?> addTask(Task task) {
        ResultBean<Object> resultBean = new ResultBean<>();
        taskService.addTask(task);
        return resultBean;
    }
}
