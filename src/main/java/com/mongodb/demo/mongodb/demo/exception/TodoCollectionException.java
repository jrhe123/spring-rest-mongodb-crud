package com.mongodb.demo.mongodb.demo.exception;

public class TodoCollectionException extends Exception {

    private static final long serialVerisionUID = 1L;

    public TodoCollectionException(String message) {
        super(message);
    }

    public static String NotFoundException(String id) {
        return "Todo with: " + id + " no found";
    }

    public static String TodoAlreadyExists(){
        return "Todo with given name already exists";
    }
}
