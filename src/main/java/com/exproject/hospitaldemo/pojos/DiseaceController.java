package com.exproject.hospitaldemo.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("saveDiseace")
public class DiseaceController {
@Autowired
private DiseaceDao diseacedao;
@PostMapping("/di")
public void saveDiseace(@RequestBody Diseace diseace){
	diseacedao.save(diseace);
}
}
