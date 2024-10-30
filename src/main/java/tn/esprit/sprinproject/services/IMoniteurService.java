package tn.esprit.sprinproject.services;



import tn.esprit.sprinproject.entity.Moniteur;

import java.util.List;

public interface IMoniteurService {

    public Moniteur addMoniteur(Moniteur moniteur);
    public Moniteur updateMoniteur(Moniteur moniteur);
    public List<Moniteur> retrieveAllMoniteurs();
    public Moniteur retrieveMoniteurById(long idM);
    public void deleteMoniteurById(long idSM);
    public Moniteur addMoniteurAndAssignToCours(Moniteur moniteur,long numC);
}
