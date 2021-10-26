package com.sebpud.demo.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HotelException {
    @ExceptionHandler(value = HotelNotFoundException.class)
    public ResponseEntity<Object> exception(HotelNotFoundException exception){
        return new ResponseEntity<>("Hotel not found", HttpStatus.NOT_FOUND);
    }

}
