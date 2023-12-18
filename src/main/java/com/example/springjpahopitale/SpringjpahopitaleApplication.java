package com.example.springjpahopitale;

import com.example.springjpahopitale.entities.Patient;
import com.example.springjpahopitale.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringjpahopitaleApplication implements CommandLineRunner {

	@Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringjpahopitaleApplication.class, args);
	}


	public void run(String... args) throws Exception {
//		patientRepository.save(new Patient(null, "Oslo", new Date(),true, 152));
//		patientRepository.save(new Patient(null, "Osaka", new Date(),true, 789));
//		patientRepository.save(new Patient(null, "Canada", new Date(),true, 236));
//		patientRepository.save(new Patient(null, "Vienna", new Date(),true, 98));
//		patientRepository.save(new Patient(null, "Fouad", new Date(),true, 70));
		List<Patient> patientList = patientRepository.findAll();
	}
}
