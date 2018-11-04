package com.exproject.hospitaldemo.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("saveMedisan")
public class MedisanController {
@Autowired
private MedisanDao medisandao;
@PostMapping("/me")
public void saveMedisan(@RequestBody Medisan medisan){
	medisandao.save(medisan);
}
}
