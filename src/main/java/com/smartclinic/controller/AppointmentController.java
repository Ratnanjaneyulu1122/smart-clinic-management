package com.smartclinic.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartclinic.dto.AppointmentRequestDTO;
import com.smartclinic.model.Appointment;
import com.smartclinic.service.AppointmentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

	private final AppointmentService appointmentService;

	public AppointmentController(AppointmentService appointmentService) {
		this.appointmentService = appointmentService;
	}

	@PostMapping
	public Appointment bookAppointment(@Valid @RequestBody AppointmentRequestDTO appointmentRequestDTO) {
		return appointmentService.bookAppointment(appointmentRequestDTO);
	//return	appointmentMapper.toResponseDTO(appointment);
	}

	@GetMapping
	public List<Appointment> getAllAppointments() {
		return appointmentService.getAllAppoinments();
	}

}
