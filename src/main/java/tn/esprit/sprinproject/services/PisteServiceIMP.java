package tn.esprit.sprinproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprinproject.entity.Piste;
import tn.esprit.sprinproject.repositories.PisteRepository;

import java.util.List;

@AllArgsConstructor //création de constructeur
@Service //obligatoire
public class PisteServiceIMP implements IPisteService{
    private PisteRepository pisteRepository;

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste retrievePisteById(long idP) {
        return pisteRepository.findById(idP).orElse(null);
    }

    @Override
    public void deletePisteById(long idp) {
        pisteRepository.deleteById(idp);

    }
}
