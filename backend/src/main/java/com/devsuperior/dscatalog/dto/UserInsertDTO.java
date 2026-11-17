package com.devsuperior.dscatalog.dto;

<<<<<<< HEAD
import com.devsuperior.dscatalog.services.validation.UserInsertValid;

@UserInsertValid
=======
>>>>>>> 37dc948 (User CRUD)
public class UserInsertDTO extends UserDTO {

	private static final long serialVersionUID = 1L;
	
	private String password;
	
	public UserInsertDTO() {
		super();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
