package com.project.login_reg.repositories;

import com.project.login_reg.models.Role;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 												
public interface RoleRepository extends CrudRepository<Role,Long>{
	public List<Role> findByName(String role);
	// Query methods go here.
	
	// Example:
	// public YourModelHere findByName(String name);
}
