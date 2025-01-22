package com.todoapp.todoappbackend.todotasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<TodoTask> getAllTasks(String priority, Boolean doneStatus, String name){
        return todoRepository.queryTasks(priority, doneStatus, name);

    }

    public void createTodoTask(String description, String priority, Date dueDate, Boolean isDone){
        TodoTask newTodo = new TodoTask(description, priority, dueDate, isDone);
        todoRepository.createTodoTask(newTodo);

    }

}
