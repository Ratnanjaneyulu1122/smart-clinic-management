package com.smartclinic.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartclinic.model.Patient;
import com.smartclinic.service.PatientService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

	private final PatientService patientService;

	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}

	@PostMapping
	public Patient createPatient(@Valid @RequestBody Patient patient) {
		return patientService.createPatient(patient);
	}

	@GetMapping
	public List<Patient> getAllPatients() {
		return patientService.getAllPatients();
	}
}
