package com.idream.exception;

import java.util.List;

import org.springframework.boot.web.error.Error;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.ErrorResponse;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.idream.model.registration.RegistrationResp;
@RestController
@ControllerAdvice
public class ExceptionCnontroller {
	  @ExceptionHandler(MethodArgumentNotValidException.class)
	    public ResponseEntity<com.idream.model.registration.ErrorResponse> badRequest(MethodArgumentNotValidException ex) {
	        List<ObjectError> errorList = ex.getBindingResult().getAllErrors();
	        String errorMsg = "";
	        for (ObjectError error : errorList) {
	            errorMsg += error.getDefaultMessage() + "; ";
	        }
	         com.idream.model.registration.ErrorResponse obj = new com.idream.model.registration.ErrorResponse() ;
	         obj.setCause(errorMsg);
	        obj.setLoginStatus("regiistration faild");
	        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(obj);
	    }
	
}
