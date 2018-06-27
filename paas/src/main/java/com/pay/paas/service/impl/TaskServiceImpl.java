package com.pay.paas.service.impl;

import com.pay.paas.dao.TaskMapper;
import com.pay.paas.entity.Task;
import com.pay.paas.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskMapper taskMapper;

    @Autowired
    public TaskServiceImpl(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    @Override
    public List<Task> listTask() {
        return taskMapper.selectByExample(null);
    }

    @Override
    @Transactional
    public void addTask(Task task) {
        taskMapper.insertSelective(task);
    }

    @Override
    public void deleteTask(Task task) {
        taskMapper.deleteByPrimaryKey(task.getId());
    }
}
