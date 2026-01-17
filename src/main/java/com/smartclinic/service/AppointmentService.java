package com.smartclinic.service;

import java.util.List;

import com.smartclinic.dto.AppointmentRequestDTO;
import com.smartclinic.model.Appointment;

public interface AppointmentService {

	Appointment bookAppointment(AppointmentRequestDTO appoinmentRequestDTO);

	List<Appointment> getAllAppoinments();

}
