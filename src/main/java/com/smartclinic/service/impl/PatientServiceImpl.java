package com.smartclinic.service.impl;

import java.util.List;

import com.smartclinic.model.Patient;
import com.smartclinic.repository.PatientRepository;
import com.smartclinic.service.PatientService;

public class PatientServiceImpl implements PatientService {
	private final PatientRepository patientRepository;

	public PatientServiceImpl(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

	@Override
	public Patient createPatient(Patient patient) {

		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getAllPatients() {

		return patientRepository.findAll();
	}

}
