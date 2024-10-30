package tn.esprit.sprinproject.services;



import tn.esprit.sprinproject.entity.Inscription;

import java.util.List;

public interface IInscriptionService {
    public Inscription addInscription(Inscription inscription);
    public Inscription updateInscription(Inscription inscription);
    public List<Inscription> retrieveAllInscriptions();
    public Inscription retrieveInscriptionById(long idI);
    public void deleteInscriptionById(long idI);

    public Inscription AddInscriAndAssignToSkieur(Inscription inscription , long idSk);

    public Inscription AddInscriptionAndAssingToCours(Inscription inscription , long idCours);
}
