package com.wofitu.Springboot.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity()
public class ToDoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String task;
    private String status;
    public ToDoModel() {
    }
    public ToDoModel(Long id, String task, String status) {
        this.id = id;
        this.task = task;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ToDoModel{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


}
