package ma.ac.emi.ginfo.gestionnote.Repositories;

import ma.ac.emi.ginfo.gestionnote.models.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
    public List<Personne> findByNom(String Nom);
}
