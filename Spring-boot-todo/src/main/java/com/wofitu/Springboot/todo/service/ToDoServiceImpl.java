package com.wofitu.Springboot.todo.service;


import com.wofitu.Springboot.todo.entity.ToDoModel;
import com.wofitu.Springboot.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoServiceImpl implements ToDoService {
    @Autowired
    ToDoRepository toDoRepository;

    @Override
    public ToDoModel saveToDo(ToDoModel toDoModel) {
        return toDoRepository.save(toDoModel);
    }

    @Override
    public List<ToDoModel> getAllToDos() {
        return toDoRepository.findAll();
    }

    @Override
    public Optional<Optional<ToDoModel>> getToDoById(Long id) {
        return Optional.of(toDoRepository.findById(id));
    }

    @Override
    public void deleteToDoById(Long id) {
        toDoRepository.deleteById(id);
    }

}
