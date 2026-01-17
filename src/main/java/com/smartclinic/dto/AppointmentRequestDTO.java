package com.smartclinic.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppointmentRequestDTO {

	@NotNull
	private Long doctorId;

	@NotNull
	private Long patientId;

	@NotNull
	private LocalDate appointmentDate;

}
