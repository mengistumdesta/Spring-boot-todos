package com.wofitu.Springboot.todo.service;

import com.wofitu.Springboot.todo.entity.ToDoModel;

import java.util.List;
import java.util.Optional;

public interface ToDoService {
   public ToDoModel saveToDo(ToDoModel toDoModel);
   public List<ToDoModel> getAllToDos();

  public Optional<Optional<ToDoModel>> getToDoById(Long id);

  public  void deleteToDoById(Long id);
}
