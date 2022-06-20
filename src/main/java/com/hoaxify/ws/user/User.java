package com.hoaxify.ws.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	@Size(min=4,max=255)
	private String username;
	
	@NotNull
	private String displayName;
	
	@NotNull
	@Size(min=4,max=255)
	//@Pattern(regexp = "^(?=.*[a-z])[A-Z].$")
	private String password;
	
	
}
