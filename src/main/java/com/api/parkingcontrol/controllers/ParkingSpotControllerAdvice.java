package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.exceptions.ParkingSpotConflitException;
import com.api.parkingcontrol.exceptions.ParkingSpotNullException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ParkingSpotControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ParkingSpotNullException.class)
    public ResponseEntity<Object> ErrorNullCaption(){
        Map<String, Object> body = new HashMap<String, Object>();
        body.put("message", "Verifique os campos preenchidos");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }

    @ExceptionHandler(ParkingSpotConflitException.class)
    public ResponseEntity<Object> ErrorConflictCaption(){
        Map<String, Object> body = new HashMap<String, Object>();
        body.put("message", "Conflito de informações já existentes.");
        return ResponseEntity.status(HttpStatus.CONFLICT).body(body);
    }
}
