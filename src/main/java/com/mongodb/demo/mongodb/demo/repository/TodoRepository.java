package com.mongodb.demo.mongodb.demo.repository;

import com.mongodb.demo.mongodb.demo.model.TodoDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRepository extends MongoRepository<TodoDTO, String> {

    // parameter called todo
    // index '0' parameter from function
    @Query("{'todo': ?0}")
    Optional<TodoDTO> findByTodo(String todo);
}
