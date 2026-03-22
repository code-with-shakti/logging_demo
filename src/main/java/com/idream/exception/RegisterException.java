package com.idream.exception;

import lombok.Data;

@Data
public class RegisterException  extends Exception {
	private String errMsg;

}
