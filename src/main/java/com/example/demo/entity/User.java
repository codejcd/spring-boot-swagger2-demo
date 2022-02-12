package com.example.demo.entity;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "유저")
public class User{
	
	@Schema(description = "유저 고유번호")
	private String id;
	
	@Schema(description = "유저 명")
	private String name;
	
	@Schema(description = "유저 이메일")
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}