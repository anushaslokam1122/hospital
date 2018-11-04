package com.exproject.hospitaldemo.pojos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VisitDao extends JpaRepository<Visit, Long>{

}
