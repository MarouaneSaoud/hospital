package ma.emsi.hospital.Repositories;

import ma.emsi.hospital.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin , Long> {
    Medecin findByNom(String nom);
}
