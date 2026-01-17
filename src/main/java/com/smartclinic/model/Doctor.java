package com.smartclinic.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "doctors")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String name;

	@NotBlank
	private String specialization;

	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Appointment> appointments;

}

/*
 * In a clinic:
 * 
 * A Doctor can have many appointments
 * 
 * A Patient can have many appointments
 * 
 * So:
 * 
 * Doctor → 1️ to many Appointments
 * 
 * Patient → 1️ to many Appointments
 * 
 * This is a One-to-Many relationship.
 */