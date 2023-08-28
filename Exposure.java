package edu.disease.asn1;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Exposure {
	
	
	
	private LocalDateTime dateTime;
	private UUID patientID;
	private String exposureType;
	
	
	public Exposure(LocalDateTime dateTime, UUID patientID, String exposureType) {
		
		this.dateTime = dateTime;
		this.patientID = patientID;
		this.exposureType = exposureType;
	}
	
	public LocalDateTime getDateTime() {
		return dateTime;		
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
		
	}
	public UUID getPatientId() {
		return patientID;
	}
	
	public void setPatientId(UUID patientID) {
		this.patientID = patientID;
	}
	
	public String getExposureType() {
		return exposureType;
	}
	public void setExposureType(String exposureType) { 
	if (exposureType.equalsIgnoreCase(DIRECT_EXPOSURE)) || exposureType.equalsIgnoreCase(INDIRECT_EXPOSURE)) {	
	this.exposureType = exposureType;	
	}
else {
	throw new UnknownExposureTypeException("IllegalArgumentExpetion: Unknown exposure type = " + exposureType + "'");
		
	}

	}

	@Override
	public int hashCode() {
		return Objects.hash(dateTime, patientID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exposure other = (Exposure) obj;
		return Objects.equals(dateTime, other.dateTime) && Objects.equals(patientId, other.patientId);
	}

	@Override
	public String toString() {
		return "Exposure [dateTime=" + dateTime + ", patientId=" + patientId + ", exposureType=" + exposureType + "]";
	}

}
	
