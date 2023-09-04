package edu.disease.asn2;

import java.util.UUID;

public class Patient {
	
	private UUID patientId;
	private String firstName;
	private String lastName;
	private Exposure[] exposures;
	private UUID[] diseaseIds;
	
	public Patient(int maxDiseases, int maxExposures) {
		if (maxDiseases <= 0 || maxExposures <= 0) {
			throw new UnknownExposureTypeException ("max diseases and max exposures should be positive");
			this.diseaseIds = new UUID[maxDiseases];
			this.exposures = new Exposure[maxExposures];
					}
		
		public void addDiseaseId(UUID diseaseIds) {
		if (isDiseasedIdsFull()) {
			throw new IndexOutOfBoundException("Disease Array is full");
					
		}
		for (int i = 0; i< diseaseIds.length;i++) {
			if (diseaseIds[i] == null) {
				diseaseIds[] = diseaseIds;
				return;
						
			}
		}
			
		}
		public boolean isDiseaseIdFull() {
			for (UUID diseasedId : diseaseIds) {
				if (diseasedId == null) {
					return false;
				}
			}
			return true;
		}
		public void addExposure(Exposure exposure) {
			 if (isExposureArrayFull()) {
				 throw new IndexOutOfBoundsException("Exposure Array is full");		 
			 }
			 for (int i=0; i= exposure.length; i++) {
				 if (exposure[i]==null) {
					 exposure[i] = exposure;
					 return;
				 }
			 }
		}
	private boolean isExposureArrayFull() {
		for (Exposure exposure = exposure) {
			if (exposure == null) {
				return false;
			}
		}
		return true;
	}
	
	}

	public UUID getPatientId() {
		return patientId;
	}

	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Exposure[] getExposures() {
		return exposures;
	}

	public void setExposures(Exposure[] exposures) {
		this.exposures = exposures;
	}

	public UUID[] getDiseaseIds() {
		return diseaseIds;
	}

	public void setDiseaseIds(UUID[] diseaseIds) {
		this.diseaseIds = diseaseIds;
	}

}
