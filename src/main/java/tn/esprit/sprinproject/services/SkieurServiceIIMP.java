package tn.esprit.sprinproject.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.sprinproject.entity.Piste;
import tn.esprit.sprinproject.entity.Skieur;
import tn.esprit.sprinproject.entity.TypeAbonnement;
import tn.esprit.sprinproject.repositories.PisteRepository;
import tn.esprit.sprinproject.repositories.SkieurRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor //création de constructeur
@Service
@Slf4j
public class SkieurServiceIIMP implements ISkieurService{

    private SkieurRepository skieurRepository;
    private PisteRepository pisteRepository;

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur retrieveSkieurById(long idSK) {
        return skieurRepository.findById(idSK).orElse(null);
    }

    @Override
    public void deleteSkieurById(long idSK) {
 skieurRepository.deleteById(idSK);
    }

    @Override
    public Skieur assignSkieurToPiste(long idSk, long idPiste) {
        Skieur skieur = skieurRepository.findById(idSk).orElse(null);
        Piste  piste = pisteRepository.findById(idPiste).orElse(null);
        try {
            skieur.getPistes().add(piste);
        }
        catch (NullPointerException e) {
            List<Piste> pistes = new ArrayList<>();
            pistes.add(piste);
            skieur.setPistes(pistes);
        }
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur getSkieurByNom(String nomSk) {
        return skieurRepository.findByNomsk(nomSk);
    }

    @Override
    public Skieur getSkieurByPrenom(String prenomSk) {
        return skieurRepository.findByPrenomsk(prenomSk);
    }

    @Override
    public List<Skieur> getSkieurByDateNaissance(LocalDate dateNaissance) {
        return skieurRepository.findByDatenaissanceGreaterThan(dateNaissance);
    }

    @Override
    public Skieur getSkieurByNomAndPrenom(String nomSk, String prenomSk) {
        return skieurRepository.findByNomskAndPrenomsk(nomSk, prenomSk);
    }

    @Override
    public List<Skieur> getSkieurByTypeAbonnement(TypeAbonnement typeAbonnement) {
        return skieurRepository.findByAbonnement_TypeAbon(typeAbonnement);
    }

    @Override
    public List<Skieur> retriveSkieurByVille(String villeSk) {
        return skieurRepository.retriveSkieurByVille(villeSk);
    }
//@Scheduled(fixedRate = 30000)
//    public void fixedRateMethod(){
//        log.info("Method with fixed rate");
//    }
//    @Scheduled(fixedDelay = 30000)
//    public void fixedDelayMethod(){
//        log.info("fixed Delay Method");
//    }
@Scheduled(cron ="0 41 19 31 10 *" )
public void fixedCronMethod(){
    log.info("Method with fixed cron");
}
}
