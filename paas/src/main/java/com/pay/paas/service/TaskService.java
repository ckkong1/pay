package com.pay.paas.service;

import com.pay.paas.entity.Task;

import java.util.List;

public interface TaskService {
    List<Task> listTask();
    void addTask(Task task);
    void deleteTask(Task task);
}
