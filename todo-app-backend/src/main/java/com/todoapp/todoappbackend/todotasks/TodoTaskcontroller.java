package com.todoapp.todoappbackend.todotasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController


public class TodoTaskcontroller {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<TodoTask> getTodoTasks(String priority, Boolean doneStatus, String name ){
        return todoService.getAllTasks(priority, doneStatus, name);

    }

    @PostMapping("/todos")
    public void createTodoTask(String description, String priority,Date dueDate, Boolean isDone){
        todoService.createTodoTask(description, priority, dueDate, isDone);

    }






}
