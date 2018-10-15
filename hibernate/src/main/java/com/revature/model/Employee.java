package com.revature.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "EMPLOYEES")
public class Employee {
	@Id
	@Column(name = "ID")
	int id;
	
	@Column(name = "NAME")
	String name;
	
	@Column(name = "USERNAME")
	String username;
	
	@Column(name = "PASSWORD")
	String password;
	
	@Column(name = "email")
	String email;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="EMPLOYEES")
	Set<Request> requests;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Request> getRequests() {
		return requests;
	}

	public void setRequests(Set<Request> requests) {
		this.requests = requests;
	}
	

}
