package tn.esprit.sprinproject.services;



import tn.esprit.sprinproject.entity.Inscription;
import tn.esprit.sprinproject.entity.Support;

import java.util.List;

public interface IInscriptionService {
    public Inscription addInscription(Inscription inscription);
    public Inscription updateInscription(Inscription inscription);
    public List<Inscription> retrieveAllInscriptions();
    public Inscription retrieveInscriptionById(long idI);
    public void deleteInscriptionById(long idI);

    public Inscription AddInscriAndAssignToSkieur(Inscription inscription , long idSk);

    public Inscription AddInscriptionAndAssingToCours(Inscription inscription , long idCours);

    public List<Integer> numSemaineofMoniteurBySupport(Long numMoniteur, Support support);
}
