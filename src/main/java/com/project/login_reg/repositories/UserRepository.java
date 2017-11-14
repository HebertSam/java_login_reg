package com.project.login_reg.repositories;

import com.project.login_reg.models.Role;
import com.project.login_reg.models.User;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 												
public interface UserRepository extends CrudRepository<User,Long>{
	public User findByUsername(String username);
	
	// Example:
	// public YourModelHere findByName(String name);
}
