package com.exproject.hospitaldemo.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("saveVisit")
public class VisitController {
	@Autowired
   private VisitDao visitdao;
	@PostMapping("/all")
	public void saveVisit(@RequestBody Visit visit){
		visitdao.save(visit);
	}
   
}
