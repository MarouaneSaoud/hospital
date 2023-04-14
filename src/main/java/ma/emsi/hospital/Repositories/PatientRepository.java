package ma.emsi.hospital.Repositories;

import ma.emsi.hospital.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient , Long> {
     Patient findByNom(String Nom);
     public List<Patient> findByMalade(boolean m);
     Page<Patient> findByMalade(boolean m , Pageable pageable);
     List<Patient> findByMaladeAndScoreLessThan(boolean m , int s);
     List<Patient> findByMaladeIsTrueAndScoreLessThan(int s);
     @Query("select p from Patient p where p.score<:x or p.nom like :z")
     List<Patient> chercherPartient(@Param("x") int score , @Param("z") String nom);


}
