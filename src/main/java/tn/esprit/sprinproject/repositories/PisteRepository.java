package tn.esprit.sprinproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprinproject.entity.Piste;

public interface PisteRepository extends JpaRepository<Piste, Long> {
}
