package ma.emsi.hospital;

import ma.emsi.hospital.Repositories.ConsultationRepository;
import ma.emsi.hospital.Repositories.MedecinRepository;
import ma.emsi.hospital.Repositories.PatientRepository;
import ma.emsi.hospital.Repositories.RendezVousRepository;
import ma.emsi.hospital.entities.*;
import ma.emsi.hospital.service.IHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
@Component
public class HospitalApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
      /*  for (int i =0 ; i<10 ; i++) {
            patientRepository.save
                    (new Patient());
        }


        System.out.println("********************All patient*********************");
        Page<Patient> patientList= patientRepository.findAll(PageRequest.of(0,5));

        patientList.forEach(System.out::println);
        System.out.println("********************Pagination*********************");
        System.out.println("Total des pages :"+patientList.getTotalPages());
        System.out.println("Total des elements  :"+patientList.getTotalElements());
        System.out.println("Num pages :"+patientList.getNumber());
        System.out.println("********************Show patient*********************");
        List<Patient> content = patientList.getContent();
        content.forEach(System.out::println);
        System.out.println("********************Patient by id*********************");
        Patient patient= patientRepository.findById(2L).orElse(null);
        if(patient!=null){
            System.out.println(patient);
        }
        System.out.println("********************Update*********************");
        patient.setScore(300);
        patientRepository.save(patient);
        System.out.println("********************Delete*********************");
        patientRepository.deleteById(1L);
        System.out.println("********************PatientMalade*********************");
        Page<Patient> PatientMalade= patientRepository.findByMalade(true,PageRequest.of(0,5));
        PatientMalade.forEach(System.out::println);
        System.out.println("********************PatientMaladeAndScore*********************");
        List<Patient> PatientMaladeAndScore = patientRepository.findByMaladeAndScoreLessThan(true , 12);
        PatientMaladeAndScore.forEach(System.out::println);
        System.out.println("********************PatientMaladeIsTrueAndScore*********************");
        List<Patient> findByMaladeIsTrueAndScoreLessThan = patientRepository.findByMaladeIsTrueAndScoreLessThan(10);
        findByMaladeIsTrueAndScoreLessThan.forEach(System.out::println);
        System.out.println("********************ChercherPatient*********************");
        List<Patient> chercher= patientRepository.chercherPartient(70 , "%marouane%");
        chercher.forEach(System.out::println);*/


    }
    @Bean
    CommandLineRunner start(IHospitalService HospitalService,
                            ConsultationRepository consultationRepository ,
                            MedecinRepository medecinRepository ,
                            RendezVousRepository rendezVousRepository ,
                            PatientRepository patientRepository){
        return args->{
       /*     Stream.of("Mohamed", "youssef","samir")
                    .forEach(name->{
                        Patient patient = new Patient();
                        patient.setNom(name);
                        patient.setDatenaissance(new Date());
                        patient.setScore(120);
                        patient.setMalade(true);
                        HospitalService.savePatient(patient);
                    });


            Stream.of("hamid", "Majda","khalid")
                    .forEach(name->{
                        Medecin medecin = new Medecin();
                        medecin.setNom(name);
                        medecin.setEmail(name+"@gmail.com");
                        medecin.setSpecialite("Generaliste");
                        HospitalService.saveMedecin(medecin);
                    });*/
            Patient patient = patientRepository.findById(2L).orElse(null);
            Patient patient1= patientRepository.findByNom("Mohamed");

            Medecin medecin = medecinRepository.findByNom("hamid");

      /*  RendezVous rendezVous=new RendezVous();
            rendezVous.setDate(new Date());
            rendezVous.setStatus(StatusRDV.PENDING);
            rendezVous.setPatient(patient);
            rendezVous.setMedecin(medecin);
            HospitalService.saveRendezVous(rendezVous);
            RendezVous rendezVous1 =rendezVousRepository.findAll().get(0);

            Consultation consultation = new Consultation();
            consultation.setDate_consultation(new Date());
            consultation.setRapport("ABC");
            consultation.setRendezVous(rendezVous1);
            HospitalService.saveConsultation(consultation);*/



        };
    }
}
