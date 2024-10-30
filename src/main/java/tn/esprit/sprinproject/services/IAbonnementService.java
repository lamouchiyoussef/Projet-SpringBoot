package tn.esprit.sprinproject.services;

import tn.esprit.sprinproject.entity.Abonnement;
import tn.esprit.sprinproject.entity.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;

public interface IAbonnementService {
    public List<Abonnement> getAbonnementByType(TypeAbonnement type);

    public List<Abonnement> getAbonnementByDate(LocalDate dateDebut, LocalDate dateFin);
}
