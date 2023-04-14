package ma.emsi.hospital.service;

import jakarta.transaction.Transactional;
import ma.emsi.hospital.Repositories.ConsultationRepository;
import ma.emsi.hospital.Repositories.MedecinRepository;
import ma.emsi.hospital.Repositories.PatientRepository;
import ma.emsi.hospital.Repositories.RendezVousRepository;
import ma.emsi.hospital.entities.Consultation;
import ma.emsi.hospital.entities.Medecin;
import ma.emsi.hospital.entities.Patient;
import ma.emsi.hospital.entities.RendezVous;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Transactional
@Service
public class IHospitalServiceImpl implements IHospitalService {
    ConsultationRepository consultationRepository;
    PatientRepository patientRepository;

    public IHospitalServiceImpl(ConsultationRepository consultationRepository, PatientRepository patientRepository, RendezVousRepository rendezVousRepository, MedecinRepository medecinRepository) {
        this.consultationRepository = consultationRepository;
        this.patientRepository = patientRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.medecinRepository = medecinRepository;
    }

    RendezVousRepository rendezVousRepository;
    MedecinRepository medecinRepository;
    @Override
    public Patient savePatient(Patient patient) {

       return  patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
