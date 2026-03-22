package com.idream.model.registration;

import lombok.Data;

@Data
public class ErrorResponse {
	private String cause;
	private String loginStatus;

}
