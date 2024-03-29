package com.example.demo.exception;

public class ToDoException extends Exception {
    private static final long serialVersionUID = 1L;

    private String errorMessage;

    private String getErrorMessage() {
        return errorMessage;
    }

    public ToDoException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public ToDoException() {super();}
}
