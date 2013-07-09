package org.bahmni.module.bahmnicore.service;

import org.bahmni.module.bahmnicore.contract.patient.response.PatientConfigResponse;
import org.bahmni.module.bahmnicore.model.BahmniPatient;
import org.openmrs.Patient;

public interface BahmniPatientService {
    public PatientConfigResponse getConfig();
    public Patient createPatient(BahmniPatient bahmniPatient);
    public Patient updatePatient(BahmniPatient bahmniPatient);
    public void updateImage(String uuid, String imageData);
}
