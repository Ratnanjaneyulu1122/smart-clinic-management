package com.smartclinic.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartclinic.model.Doctor;
import com.smartclinic.repository.DoctorRepository;
import com.smartclinic.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

	private final DoctorRepository doctorRepository;

	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}

	@Override
	public Doctor createDoctor(Doctor doctor) {

		return doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> getAllDoctors() {

		return doctorRepository.findAll();
	}

}
