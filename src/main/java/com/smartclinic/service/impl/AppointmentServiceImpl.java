package com.smartclinic.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartclinic.dto.AppointmentRequestDTO;
import com.smartclinic.model.Appointment;
import com.smartclinic.model.Doctor;
import com.smartclinic.model.Patient;
import com.smartclinic.repository.AppointmentRepository;
import com.smartclinic.repository.DoctorRepository;
import com.smartclinic.repository.PatientRepository;
import com.smartclinic.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	private final AppointmentRepository appointmentRepository;
	private final DoctorRepository doctorRepository;
	private final PatientRepository patientRepository;

	public AppointmentServiceImpl(AppointmentRepository appointmentRepository, DoctorRepository doctorRepository,
			PatientRepository patientRepository) {
		this.appointmentRepository = appointmentRepository;
		this.doctorRepository = doctorRepository;
		this.patientRepository = patientRepository;
	}

	@Override
	public Appointment bookAppointment(AppointmentRequestDTO appoinmentRequestDTO) {
		Doctor doctor = doctorRepository.findById(appoinmentRequestDTO.getDoctorId())
				.orElseThrow(() -> new RuntimeException("Doctor not foumd"));

		Patient patient = patientRepository.findById(appoinmentRequestDTO.getPatientId())
				.orElseThrow(() -> new RuntimeException("Patient not found"));

		Appointment appointment = new Appointment();
		appointment.setDoctor(doctor);
		appointment.setPatient(patient);
		appointment.setAppointmentDate(appoinmentRequestDTO.getAppointmentDate());

		return appointmentRepository.save(appointment);
	}

	@Override
	public List<Appointment> getAllAppoinments() {
		return appointmentRepository.findAll();
	}

}
