package com.wofitu.Springboot.todo.repository;

import com.wofitu.Springboot.todo.entity.ToDoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoModel, Long> {
}
