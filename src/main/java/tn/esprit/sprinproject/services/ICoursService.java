package tn.esprit.sprinproject.services;



import tn.esprit.sprinproject.entity.Cours;

import java.util.List;

public interface ICoursService {
    public Cours addCours(Cours cours);
    public Cours updateCours(Cours cours);
    public List<Cours> retrieveAllCours();
    public Cours retrieveCoursById(long idC);
    public void deleteCoursById(long idC);
}
