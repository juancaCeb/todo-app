package com.todoapp.todoappbackend.todotasks;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class TodoRepository {

private List<TodoTask> todos = new ArrayList<>();

public List<TodoTask> queryTasks(@RequestParam(required = false) String priority,
                                 @RequestParam(required = false)Boolean doneStatus,
                                 @RequestParam(required = false)String name){
    return todos;

}

public void createTodoTask(TodoTask newTodoTask){
    todos.add(newTodoTask);


}



}
