package com.practice.Controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.dto.LoginData;
import com.practice.dto.ValidateErrorResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/lgform")
public class MyController {
	@PostMapping("login")
	public ResponseEntity<?> validateUserDetails(@Valid @RequestBody LoginData data, BindingResult bindingResult) {
		ValidateErrorResponse validationErrors = new ValidateErrorResponse();
		if (bindingResult.hasErrors()) {
			bindingResult.getFieldErrors().forEach(error -> {
				if (error.getField().equals("username"))
					validationErrors.setUsernameError(error.getDefaultMessage());
				if (error.getField().equals("email"))
					validationErrors.setEmailError(error.getDefaultMessage());
				if (error.getField().equals("isChecked"))
					validationErrors.setCheckError(error.getDefaultMessage());
			});
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(validationErrors);
		}
		return ResponseEntity.ok(Map.of("message", "Login Successfull"));
	}
}
