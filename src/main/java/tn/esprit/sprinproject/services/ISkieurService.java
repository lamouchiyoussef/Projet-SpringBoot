package tn.esprit.sprinproject.services;



import tn.esprit.sprinproject.entity.Skieur;
import tn.esprit.sprinproject.entity.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;

public interface ISkieurService {
    public Skieur addSkieur(Skieur skieur);
    public Skieur updateSkieur(Skieur skieur);
    public List<Skieur> retrieveAllSkieurs();
    public Skieur retrieveSkieurById(long idSK);
    public void deleteSkieurById(long idSK);
    public Skieur assignSkieurToPiste(long idSk,long idPiste);
    public Skieur getSkieurByNom(String nomSk);
    public Skieur getSkieurByPrenom(String prenomSk);
    public List<Skieur> getSkieurByDateNaissance(LocalDate dateNaissance);
    public Skieur getSkieurByNomAndPrenom(String nomSk, String prenomSk);
    public List<Skieur> getSkieurByTypeAbonnement(TypeAbonnement typeAbonnement);
    public List<Skieur> retriveSkieurByVille(String villeSk);
}
