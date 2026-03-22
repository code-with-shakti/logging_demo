package com.idream;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idream.model.registration.RegistrationReq;
import com.idream.model.registration.RegistrationResp;

@RestController
@RequestMapping("/emp-controller")  // Good
public class LoginMgmt {
    
    @PostMapping("/login-mgmt")  // ✅ Fixed: "login-mgmt"
    public String login() {
        return "Login successful";  // ✅ Fixed spelling
    }
    @PostMapping("/regist-mgmt")
    public ResponseEntity<RegistrationResp> registration(@RequestBody RegistrationReq req) {
    	return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    
    
    
    
}

