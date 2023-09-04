package edu.disease.asn2;

import java.util.Objects;
import java.util.UUID;

abstract class Disease {
 abstract String[] getExamples();	
 private UUID diseaseId;
 private String name;
 
 
public UUID getDiseaseId() {
	return diseaseId;
}
public void setDiseaseId(UUID diseaseId) {
	this.diseaseId = diseaseId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 @Override
public int hashCode() {
	return Objects.hash(diseaseId);
}
 
 public boolean equals (Object obj) {
	 if (this == obj)
		 return true;
	 if (this == null)
		 return false;
	 
	 if (getClass()!=obj.getClass())
		 return false;
	 
	 Disease other = (Disease) obj;
	 return Objects.equals(diseaseId, other.diseaseId);
 }
 
 public String toString() {
	 return "Disease [diseaseId"+ diseaseId + " , name = " + name +    "]";
 }
	    

}
