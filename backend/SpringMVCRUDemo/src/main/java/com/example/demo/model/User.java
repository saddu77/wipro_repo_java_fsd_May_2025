package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;	
	private String username;
	private String password;
	
//	default constructor
	public User() {
		
	}
//	parameterized constructor
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	//	getters and setters

	public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
// toString() method
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}	
	
}
