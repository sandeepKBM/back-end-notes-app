package com.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_note")
public class Note {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	@Column(name="user_title")
	private String title;
	
	@Column(name="user_body")
	private String body;
	
	@ManyToOne()
	@JoinColumn(name="user_id")
	private user usr;
	
	public user getUsr() {
		return usr;
	}

	public void setUsr(user usr) {
		this.usr = usr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Note() {
		
	}
	
	public Note(int id, String title, String body) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
	}
	

}
