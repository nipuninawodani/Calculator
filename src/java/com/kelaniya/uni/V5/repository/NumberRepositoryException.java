package com.kelaniya.uni.V5.repository;

public class NumberRepositoryException extends Exception{
    public NumberRepositoryException(Exception e, String message) {
        super (message , e);
    }
}