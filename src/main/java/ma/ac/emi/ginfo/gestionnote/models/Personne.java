package ma.ac.emi.ginfo.gestionnote.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
    @Id
    @NotNull
    private Long matricule;
    @NotNull
    private String nom;
    @NotNull
    private String prenom;
    private LocalDate dateNaissance;



    public Personne(Long matricule, String nom, String prenom, LocalDate dateNaissance) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        setDateNaissance(dateNaissance);
    }

    public Personne() {

    }

    public Long getMatricule() {
        return matricule;
    }

    public void setMatricule(Long matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
