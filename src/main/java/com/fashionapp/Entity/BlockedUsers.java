package com.fashionapp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blocked_users")
public class BlockedUsers {
	
	/*To-DO : user can block another user with out follwing him*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long userId;
	private long blockedUserId;
	private String email;
	private String blockedEmail;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getBlockedUserId() {
		return blockedUserId;
	}
	public void setBlockedUserId(long blockedUserId) {
		this.blockedUserId = blockedUserId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBlockedEmail() {
		return blockedEmail;
	}
	public void setBlockedEmail(String blockedEmail) {
		this.blockedEmail = blockedEmail;
	}
	
	
	

}
