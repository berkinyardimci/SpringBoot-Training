package com.hoaxify.ws.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String username;
	private String displayName;
	private String password;
	
	
}
