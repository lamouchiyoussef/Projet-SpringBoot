package tn.esprit.sprinproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import tn.esprit.sprinproject.entity.Abonnement;
import tn.esprit.sprinproject.entity.TypeAbonnement;
import tn.esprit.sprinproject.repositories.AbonnementRepository;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@Service
public class AbonnementServiceIMP implements IAbonnementService {
private AbonnementRepository abonnementRepository;
    @Override
    public List<Abonnement> getAbonnementByType(TypeAbonnement type) {
        return abonnementRepository.findByTypeAbonOrderByDateDebutAsc(type);
    }
    @Override
    public List<Abonnement> getAbonnementByDate(LocalDate dateDebut, LocalDate dateFin) {
        return abonnementRepository.findByDateDebutBetween(dateDebut, dateFin);
    }
}
