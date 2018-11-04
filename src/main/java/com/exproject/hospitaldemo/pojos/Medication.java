package com.exproject.hospitaldemo.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="medication")
public class Medication {
	private Long id;
	private Medisan medisan;
	private String howtouse;
	private Integer quantity;
	private String duration;
	private ComplaintDetails comp;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@ManyToOne
	@JoinColumn(name="mid")

	public Medisan getMedisan() {
		return medisan;
	}
	public void setMedisan(Medisan medisan) {
		this.medisan = medisan;
	}
	public String getHowtouse() {
		return howtouse;
	}
	public void setHowtouse(String howtouse) {
		this.howtouse = howtouse;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@ManyToOne
	@JoinColumn(name="cid")

	public ComplaintDetails getComp() {
		return comp;
	}
	public void setComp(ComplaintDetails comp) {
		this.comp = comp;
	}
	
}