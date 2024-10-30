package tn.esprit.sprinproject.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprinproject.entity.Cours;
import tn.esprit.sprinproject.entity.Moniteur;
import tn.esprit.sprinproject.repositories.CoursRepository;
import tn.esprit.sprinproject.repositories.MoniteurRepository;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor //création de constructeur
@Service //obligatoire
public class MoniteurServiceIMP implements  IMoniteurService {

    private MoniteurRepository moniteurRepository;
    private CoursRepository coursRepository;

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return  moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return  moniteurRepository.save(moniteur);
    }

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return  moniteurRepository.findAll();
    }

    @Override
    public Moniteur retrieveMoniteurById(long idM) {
        return  moniteurRepository.findById(idM).orElse(null);
    }

    @Override
    public void deleteMoniteurById(long idSK) {
        moniteurRepository.deleteById(idSK);
    }

    @Override
    public Moniteur addMoniteurAndAssignToCours(Moniteur moniteur, long numC) {
        Cours cours = coursRepository.findById(numC).orElse(null);
        List<Cours> coursList = new ArrayList<>();
        coursList.add(cours);
        moniteur.setCours(coursList);

        return moniteurRepository.save(moniteur);

    }
}
