package com.exproject.hospitaldemo.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="visit")
public class Visit {
	private Long id;
	private Date date_time;
	private Appointment appoint;
	private Doctor doctor;
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name="did")
	public Doctor getDoctor() {
		return doctor;
	}
	@OneToOne
	@JoinColumn(name="A_id")
	public Appointment getAppoint() {
		return appoint;
	}
	public void setAppoint(Appointment appoint) {
		this.appoint = appoint;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Date getDate_time() {
		return date_time;
	}
	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}
	
	
}