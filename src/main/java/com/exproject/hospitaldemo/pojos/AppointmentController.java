package com.exproject.hospitaldemo.pojos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("saveAppointment")
public class AppointmentController {
	@Autowired
   private AppointmentDao appointmentdao;
	@PostMapping("/all")
   public void saveAppointment(@RequestBody Appointment appointment){
		appointmentdao.save(appointment);
	}
}
