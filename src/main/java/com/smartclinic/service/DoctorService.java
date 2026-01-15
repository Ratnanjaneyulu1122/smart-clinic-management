package com.smartclinic.service;

import java.util.List;

import com.smartclinic.model.Doctor;

public interface DoctorService {

	Doctor createDoctor(Doctor doctor);

	List<Doctor> getAllDoctors();
}
