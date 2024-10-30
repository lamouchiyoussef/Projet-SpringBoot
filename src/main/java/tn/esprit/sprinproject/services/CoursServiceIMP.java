package tn.esprit.sprinproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprinproject.entity.Cours;
import tn.esprit.sprinproject.repositories.CoursRepository;

import java.util.List;

@AllArgsConstructor //création de constructeur
@Service //obligatoire
public class CoursServiceIMP implements ICoursService {

    private CoursRepository coursRepository;
    @Override
    public Cours addCours(Cours cours) {
        return  coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return  coursRepository.save(cours);
    }

    @Override
    public List<Cours> retrieveAllCours() {
        return  coursRepository.findAll();
    }

    @Override
    public Cours retrieveCoursById(long idC) {
        return coursRepository.findById(idC).orElse(null);
    }

    @Override
    public void deleteCoursById(long idC) {
coursRepository.deleteById(idC);
    }
}
