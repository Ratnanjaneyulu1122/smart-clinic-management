package com.smartclinic.service;

import java.util.List;

import com.smartclinic.model.Patient;

public interface PatientService {

	Patient createPatient(Patient patient);

	List<Patient> getAllPatients();
}
