package com.wofitu.Springboot.todo.controller;

import com.wofitu.Springboot.todo.entity.ToDoModel;
import com.wofitu.Springboot.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ToDoController {
    @Autowired
    private ToDoService toDoService;
    @PostMapping("/api/todos")
    public ToDoModel saveToDos(@RequestBody ToDoModel toDoModel){
       return  toDoService.saveToDo(toDoModel);
    }

    @GetMapping("/api/todos")
    public List<ToDoModel> getAllToDos(){
        return toDoService.getAllToDos();
    }

    @GetMapping("/api/todos/{id}")
    public Optional<Optional<ToDoModel>> getToDoById(@PathVariable("id") Long id){
        return toDoService.getToDoById(id);
    }

     @DeleteMapping("/api/todos/{id}")
    public void deleteToDoById(@PathVariable("id") Long id){
      toDoService.deleteToDoById(id);
    }

}
