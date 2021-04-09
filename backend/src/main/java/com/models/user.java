package com.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class user {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	@Column(name="user_name")
	private String name;
	
	@Column(name="user_password")
	private String password;
	
	@Column(name="user_email")
	private String email;
	
	@OneToMany(mappedBy="usr", cascade = CascadeType.ALL)
	private List<Note> note;
	
	public List<Note> getNote() {
		return note;
	}

	public void setNote(List<Note> note) {
		this.note = note;
	}

	public user() {
		
	}
	
	public user(int id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}

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
	

}
