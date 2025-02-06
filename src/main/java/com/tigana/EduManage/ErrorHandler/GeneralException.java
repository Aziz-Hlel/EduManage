package com.tigana.EduManage.ErrorHandler;

import org.springframework.http.HttpStatus;


public class GeneralException extends RuntimeException{
    private final HttpStatus status;

    public GeneralException(String message, Throwable cause, HttpStatus status) {
        super(message, cause);
        this.status = status;
    }
    public GeneralException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
    public HttpStatus getHttpStatus() {
        return this.status;
    }
}
