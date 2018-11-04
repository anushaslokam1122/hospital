package com.exproject.hospitaldemo.pojos;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {
	private Long a_id;
	private Date datetime;
	private String primary_reason;
	private Patient a_patient;
	@Id
	@GeneratedValue
	public Long getA_id() {
		return a_id;
	}
	public void setA_id(Long a_id) {
		this.a_id = a_id;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public String getPrimary_reason() {
		return primary_reason;
	}
	public void setPrimary_reason(String primary_reason) {
		this.primary_reason = primary_reason;
	}
	@ManyToOne
	@JoinColumn(name="p_id")
	public Patient getA_patient() {
		return a_patient;
	}
	public void setA_patient(Patient a_patient) {
		this.a_patient = a_patient;
	}
    
}