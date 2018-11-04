package com.exproject.hospitaldemo.pojos;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
  private Long p_id;
  private String p_name;
  private Date dob;
  private Long phno;
  @Id
  @GeneratedValue
public Long getP_id() {
	return p_id;
}
public void setP_id(Long p_id) {
	this.p_id = p_id;
}
public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public Long getPhno() {
	return phno;
}
public void setPhno(Long phno) {
	this.phno = phno;
}
  
}