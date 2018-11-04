package com.exproject.hospitaldemo.pojos;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="complaint")
public class ComplaintDetails {
	private Long id;
	private String description;
	private List<Diseace> diseace;
	private Visit c_visit;
	private List<Medication> medication;
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@ManyToOne
	@JoinColumn(name="v_id")
	public Visit getC_visit() {
		return c_visit;
	}
	public void setC_visit(Visit c_visit) {
		this.c_visit = c_visit;
	}
	@ManyToMany
	@JoinTable(name="com_vis",
	joinColumns={@JoinColumn(name="cid")},
	inverseJoinColumns={@JoinColumn(name="disid")})

	public List<Diseace> getDiseace() {
		return diseace;
	}

	public void setDiseace(List<Diseace> diseace) {
		this.diseace = diseace;
	}
	@OneToMany(mappedBy="comp",cascade=CascadeType.ALL)
	public List<Medication> getMedication() {
		return medication;
	}
	public void setMedication(List<Medication> medication) {
		this.medication = medication;
	}
	
}