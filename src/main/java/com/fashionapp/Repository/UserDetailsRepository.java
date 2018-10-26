package com.fashionapp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.fashionapp.Entity.UserInfo;

public interface UserDetailsRepository extends CrudRepository<UserInfo, Long>{

	UserInfo findByEmail(String email);
	
	
  

}
