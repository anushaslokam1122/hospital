package com.exproject.hospitaldemo.pojos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("saveComplaint")
public class ComplaintDetailsController {
	@Autowired
   private ComplaintDetailsDao dao;
	@PostMapping("/all")
   public void saveComplaint(@RequestBody ComplaintDetails complaintdetails){
    List<Medication> medilist=complaintdetails.getMedication();
    for (Medication medication : medilist) {
    	medication.setComp(complaintdetails);
	}
		
		dao.save(complaintdetails);
	}
	}
