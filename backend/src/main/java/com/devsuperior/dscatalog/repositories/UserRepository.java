package com.devsuperior.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalog.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
<<<<<<< HEAD
<<<<<<< HEAD
	User findByEmail(String email);
=======

>>>>>>> 37dc948 (User CRUD)
=======
	User findByEmail(String email);
>>>>>>> a152e40 (Custom constraintValidator)
}
