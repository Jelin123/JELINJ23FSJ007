package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerImpl implements DiseaseControlManager {
	private Disease[] diseases;
	private Patient[] patients;
	
	DiseaseControlManagerImpl (int maxDiseases, int maxPatients){
	 if (maxDiseases <= 0 || maxPatients  <=0) {
		  throw new IllegalArgumentException("Supplied Integer cannot be used");
		  }
	  this.patients = new Patient[maxPatients];
	  this.diseases = new Disease[maxDiseases];
	  
	}
@Override
	public Disease addDisease(String name, Boolean isInfectious) {
	  if (isDiseasesArrayFull()) {
		  throw new IllegalStateException("Disease Array is Full");
	  }
	  Disease newDisease;
	  
	  if (isInfectious) {
		  newDisease = new InfectiousDisease();
		 	  }
	  else {
		  newDisease = new NonInfectiousDisease();
		  	  }
	  newDisease.setName(name);
	  newDisease.setDiseaseId(UUID.randomUUID());
	  
	  for (int i=0; i <diseases.length; i++) {
		  if (diseases[i] == null) {
			  diseases [i] = newDisease;
			  
		  }
	  }
	  return newDisease;
	}

private boolean isDiseaseArrayFull() {
	for (Disease disease : diseases) {
		if (disease == null) {
			return false;
		}
	}
	return true;
	
}
 public Disease getDisease(UUID diseaseId) {
	 
	 for (Disease disease: diseases) {
		 if (disease.getDiseaseId().equals(diseaseId)) {
			 return disease;
		 }
	 }
	 return null;
	 
 }
 public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
	 if (isPatientArrayFull()) {
		 throw new IllegalStateException("Patient Array is Full");
		 	 }
	 Patient patient = new Patient (maxDiseases, maxExposures);
	 patient.setFirstName(firstName);
	 patient.setLastName(lastName);
	 patient.setPatientId(UUID.randomUUID());
	 
	 for (int i= 0; i <patients.length; i++) {
		 if (patients[i] == null) {
			 patients[i] = patient;
			 break;
			 		 }
	 }
	 return patient;
 }
 private boolean isPatientArrayFull() {
	 for (Patient patient : patients) {
		 if (patient == null) {
			 return false;
		 }
	 }
	 return true;
 }
 
 public Patient getPatient (UUID patientId) {
	 for (Patient patient : patients) {
		 if (patient.getPatientId().equals(patientId)) {
			 return patient;
		 }
	 }
	 return null;
	 
 }
 
 public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
	 for (Patient patient: patients) {
		 if (patient.getPatientId().equals(patientId)) {
			 for (Disease disease : diseases) {
				 if (disease.getDiseaseId().equals(diseaseId)) {
					 patient.addDiseaseId(disease.getDiseaseId());
					 return;
					 
				 }
				 else {
					 throw new IllegalArgumentException("DiseaseId is not associated with diseaseLIst");
					 
				 }
			 }
				 else {
					 throw new IllegalArgumentException ("PatientId is not associated with patientList");
				 }
			 }
		 }
	 public void addExposureToPatient (UUID patientId, Exposure exposure) {
		 for (Patient patient: patients) {
			 if (patient.getPatientId().equals(patientId)) {
				 patient.addExposure(exposure);
				 return;
			 }
			 else {
				 throw new IllegalArgumentException("PatientId is not associated with PatientList");
			 }
		 }
	 }
 }
}
