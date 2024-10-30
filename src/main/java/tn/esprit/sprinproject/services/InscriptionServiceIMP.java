package tn.esprit.sprinproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprinproject.entity.Cours;
import tn.esprit.sprinproject.entity.Inscription;
import tn.esprit.sprinproject.entity.Skieur;
import tn.esprit.sprinproject.repositories.CoursRepository;
import tn.esprit.sprinproject.repositories.InscriptionRepository;
import tn.esprit.sprinproject.repositories.SkieurRepository;

import java.util.List;


@AllArgsConstructor //création de constructeur
@Service //obligatoire
public class InscriptionServiceIMP implements  IInscriptionService{

    private InscriptionRepository inscriptionRepository;
    private SkieurRepository skieurRepository;
    private CoursRepository coursRepository;
    @Override
    public Inscription addInscription(Inscription inscription) {
        return  inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return  inscriptionRepository.save(inscription);
    }

    @Override
    public List<Inscription> retrieveAllInscriptions() {
        return  inscriptionRepository.findAll();
    }

    @Override
    public Inscription retrieveInscriptionById(long idI) {
        return  inscriptionRepository.findById(idI).orElse(null);
    }

    @Override
    public void deleteInscriptionById(long idI) {
            inscriptionRepository.deleteById(idI);
    }

    @Override
    public Inscription AddInscriAndAssignToSkieur(Inscription inscription, long idSk) {
        Skieur skieur = skieurRepository.findById(idSk).orElse(null);
        inscription.setSkieur(skieur);

        return  inscriptionRepository.save(inscription);

    }

    @Override
    public Inscription AddInscriptionAndAssingToCours(Inscription inscription, long idCours) {
        Cours cours = coursRepository.findById(idCours).orElse(null);
        inscription.setCours(cours);
        return  inscriptionRepository.save(inscription);
    }
}
