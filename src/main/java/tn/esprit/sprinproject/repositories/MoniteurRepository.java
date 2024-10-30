package tn.esprit.sprinproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprinproject.entity.Moniteur;

public interface MoniteurRepository extends JpaRepository<Moniteur, Long> {
}
