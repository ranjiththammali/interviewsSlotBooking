package com.slotbooking.interviews.exception;


public class UsedNotFoundException extends RuntimeException {

    // Default constructor
    public UsedNotFoundException() {
        super();
    }

    // Constructor that accepts a message
    public UsedNotFoundException(String message) {
        super(message);
    }


}