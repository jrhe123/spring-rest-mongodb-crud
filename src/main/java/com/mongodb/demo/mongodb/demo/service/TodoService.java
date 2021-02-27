package com.mongodb.demo.mongodb.demo.service;

import com.mongodb.demo.mongodb.demo.exception.TodoCollectionException;
import com.mongodb.demo.mongodb.demo.model.TodoDTO;

import java.util.List;

public interface TodoService {

    public List<TodoDTO> getAllTodos();

    public TodoDTO getSingleTodo(String id) throws TodoCollectionException;

    public void createTodo(TodoDTO todo) throws TodoCollectionException;

    public void updateTodo(String id, TodoDTO todo) throws TodoCollectionException;

    public void deleteTodo(String id) throws TodoCollectionException;
}
