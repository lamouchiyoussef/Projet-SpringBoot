package tn.esprit.sprinproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprinproject.entity.Abonnement;
import tn.esprit.sprinproject.entity.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
    public List<Abonnement> findByTypeAbonOrderByDateDebutAsc(TypeAbonnement typeAbonnement);

    public List<Abonnement> findByDateDebutBetween(LocalDate dateDebut, LocalDate dateFin);
}
