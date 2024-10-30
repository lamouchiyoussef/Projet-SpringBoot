package tn.esprit.sprinproject.services;

import tn.esprit.sprinproject.entity.Piste;

import java.util.List;

public interface IPisteService {
    public Piste addPiste(Piste piste);
    public Piste updatePiste(Piste piste);
    public List<Piste> retrieveAllPistes();
    public Piste retrievePisteById(long idP);
    public void deletePisteById(long idp);
}
