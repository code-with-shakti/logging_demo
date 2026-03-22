package com.idream.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idream.model.registration.RegistrationResp;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/register")
public class RegisterContrl {
	@PostMapping("/user-registration")
    public ResponseEntity<RegistrationResp> register(@RequestBody @Valid  RegistrationResp req) {
		String message = "registration successfull";
		RegistrationResp resp = new RegistrationResp();
		resp.setLoginStatus(message);
		
		
    	return ResponseEntity.status(HttpStatus.OK).body(resp);
    	

}
}