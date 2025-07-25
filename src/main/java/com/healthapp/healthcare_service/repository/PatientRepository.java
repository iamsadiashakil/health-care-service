package com.healthapp.healthcare_service.repository;

import com.healthapp.healthcare_service.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}

