package com.exproject.hospitaldemo.pojos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface PatientDao extends JpaRepository<Patient, Integer> {
     @Query("select di.name,d.name,p.p_name from Medication m join m.medisan me "+
            "join m.comp c "+
    		"join c.c_visit v "+
            "join v.appoint a "+
    		"join a.a_patient p "+
            "join v.doctor d "+
    		"join c.diseace di "+
            "where me.name=?1")
	public List<Object[]> getPatientByMedicine(String name);

@Query("select di.name,d.name,p.p_name from Medication m join m.medisan me "+
        "join m.comp c "+
		"join c.c_visit v "+
        "join v.appoint a "+
		"join a.a_patient p "+
        "join v.doctor d "+
		"join c.diseace di "+
        "where me.name=?1")
public List<Object[]> getPatientByDiseace(String name);
}

