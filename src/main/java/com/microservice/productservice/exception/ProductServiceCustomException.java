package com.microservice.productservice.exception;

public class ProductServiceCustomException extends RuntimeException{

    private String errorCode;
    public ProductServiceCustomException(String message, String errorCode){

        super(message);
        this.errorCode = errorCode;

    }

    public String getErrorCode() {
        return null;
    }
}
