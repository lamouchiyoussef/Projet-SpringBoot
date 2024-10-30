package tn.esprit.sprinproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.sprinproject.entity.Skieur;
import tn.esprit.sprinproject.entity.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {

    public Skieur findByNomsk(String nomsk);

    public Skieur findByPrenomsk(String prenomsk);

    public List<Skieur>  findByDatenaissanceGreaterThan(LocalDate datenaissance);

    public Skieur findByNomskAndPrenomsk(String nomsk, String prenomsk);

    public List<Skieur> findByAbonnement_TypeAbon(TypeAbonnement typeAbonnement);
    @Query("Select s from Skieur s where s.ville=:ville")
    public List<Skieur> retriveSkieurByVille(@Param("ville") String ville);

}
