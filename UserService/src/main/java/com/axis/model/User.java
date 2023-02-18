package com.axis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String uname;
	private String uemail;
	private String upassword;
	private String urole;
	private String uqualification;
	private String uskill1;
	private String uskill2;
	private String uskill3;
	
	//used lombok
	
}
