package tn.esprit.sprinproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.sprinproject.entity.Inscription;
import tn.esprit.sprinproject.entity.Support;

import java.util.List;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
@Query("Select n.numSemale From Inscription n " +
        "Join Moniteur m on n.cours Member Of m.cours " +
        "Where m.numM=:numMonitor " +
        "And n.cours.support=:support")
   public List<Integer> numWeeksCourseOfInstructorBySupport
        (@Param("numMonitor") Long numMonitor,@Param("support") Support support);
}
