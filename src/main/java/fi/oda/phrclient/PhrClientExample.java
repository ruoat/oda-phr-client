package fi.oda.phrclient;

import org.hl7.fhir.dstu3.model.Patient;

import ca.uhn.fhir.rest.api.MethodOutcome;

public class PhrClientExample {
    public static void main(String[] args) {
        PatientService service = new PatientService();
        MethodOutcome outcome = service.createPatient("James", "Bond");
        String patientId = outcome.getId().getIdPart();
        Patient patient = service.getPatientById(patientId);
        System.out.println();
        System.out.println();
        System.out.println("*****************Found patient:");
        System.out.println("name: " + patient.getNameFirstRep().getNameAsSingleString());
        System.out.println("birthday:" + patient.getBirthDate());
    }
}
