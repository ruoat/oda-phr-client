package fi.oda.phrclient;

import java.util.Date;

import org.hl7.fhir.dstu3.model.*;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.IGenericClient;
import ca.uhn.fhir.rest.server.exceptions.ResourceNotFoundException;

public class PatientService {
    private static final String ODA_PHR_URL = "https://oda.medidemo.fi/phr/baseDstu3";

    private IGenericClient client;

    public PatientService() {
        client = FhirContext.forDstu3().newRestfulGenericClient(ODA_PHR_URL);
    }

    public MethodOutcome createPatient(String firstName, String lastName) {
        Patient patient = new Patient();
        patient.addIdentifier()
                .setSystem("http://acme.org/mrns")
                .setValue("12345");
        patient.addName()
                .setFamily(lastName)
                .addGiven(firstName);
        patient.setBirthDate(new Date());
        patient.setGender(Enumerations.AdministrativeGender.MALE);
        patient.setId(IdDt.newRandomUuid());
        return client.create().resource(patient).execute();
    }

    public Patient getPatientById(String id) {
        final Patient resource = client.read()
                .resource(Patient.class)
                .withId(id)
                .execute();
        if (resource == null) {
            throw new ResourceNotFoundException(id);
        }
        return resource;
    }

}
