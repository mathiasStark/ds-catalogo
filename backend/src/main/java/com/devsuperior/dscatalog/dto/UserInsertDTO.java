package com.devsuperior.dscatalog.dto;

<<<<<<< HEAD
<<<<<<< HEAD
import com.devsuperior.dscatalog.services.validation.UserInsertValid;

@UserInsertValid
=======
>>>>>>> 37dc948 (User CRUD)
=======
import com.devsuperior.dscatalog.services.validation.UserInsertValid;

@UserInsertValid
>>>>>>> a152e40 (Custom constraintValidator)
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
