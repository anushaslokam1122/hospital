package com.exproject.hospitaldemo.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("saveDoctor")
public class DoctorController {
	@Autowired
  private DoctorDao doctordao;
	@PostMapping("/d")
  public void saveDoctor(@RequestBody Doctor doctor){
	  doctordao.save(doctor);
  }
}
