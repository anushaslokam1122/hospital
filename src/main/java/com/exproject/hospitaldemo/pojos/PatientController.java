

package com.exproject.hospitaldemo.pojos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Patient")
public class PatientController {
	@Autowired
	private PatientDao patientdao;
	@PostMapping("/a")
	public void savePatient(@RequestBody Patient pat){
		patientdao.save(pat);
	}
	@GetMapping("/ByMedicine/{name}")
	public List<Object[]> getPatientByMedicine(@PathVariable(name="name") String name){
		return patientdao.getPatientByMedicine(name);
		
	}
	@GetMapping("/ByDiseace/{name}")
	public List<Object[]> getPatientByByDiseace(@PathVariable(name="name") String name){
		return patientdao.getPatientByDiseace(name);
	
		
	}
}
