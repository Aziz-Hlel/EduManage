package com.tigana.EduManage.ErrorHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GeneralExceptionHandler {

    @ExceptionHandler(GeneralException.class)
    public ResponseEntity<Object> handleGeneralException(GeneralException exception){
        ErrorResponseBody errorResponseBody = new ErrorResponseBody(LocalDateTime.now(), exception.getMessage(), "ui ui");
        HttpStatus httpStatus = exception.getHttpStatus();
        return new ResponseEntity<Object>(errorResponseBody, httpStatus);
    }
}
