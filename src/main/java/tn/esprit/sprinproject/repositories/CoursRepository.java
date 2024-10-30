package tn.esprit.sprinproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprinproject.entity.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long> {
}
