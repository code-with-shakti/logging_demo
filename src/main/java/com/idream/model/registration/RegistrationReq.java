package com.idream.model.registration;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RegistrationReq {
	@NotNull(message="uname must not be null" )
	@NotBlank(message="uname must not be blank" )
	@NotEmpty(message="uname must not be empty" )
	private String uname ;
	@NotNull(message="pass must not be null" )
	@NotBlank(message="pass must not be blank" )
	@NotEmpty(message="pass must not be empty" )
	private String pass ;
	@NotNull(message="mob must not be null" )
	@NotBlank(message="mob must not be blank" )
	@NotEmpty(message="mob must not be empty" )
	private String mob ;
	@NotNull(message="add must not be null" )
	@NotBlank(message="add must not be blank" )
	@NotEmpty(message="add must not be empty" )
	private String address ;

}
