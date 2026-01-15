package com.smartclinic.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartclinic.model.Doctor;
import com.smartclinic.service.DoctorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

	private DoctorService doctorService;

	public DoctorController(DoctorService doctorService) {
		this.doctorService = doctorService;
	}

	@PostMapping
	public Doctor createDoctor(@Valid @RequestBody Doctor doctor) {
		return doctorService.createDoctor(doctor);
	}

	@GetMapping
	public List<Doctor> getAllDoctores() {
		return doctorService.getAllDoctors();
	}

}
