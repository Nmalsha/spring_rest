package com.library.rest.exeption;    


public class BookNotFoundException extends RuntimeException {


    public BookNotFoundException(String message) {
        super(message);
    }
}
