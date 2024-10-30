package tn.esprit.sprinproject.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprinproject.entity.Inscription;
import tn.esprit.sprinproject.services.IInscriptionService;

import java.util.List;

@AllArgsConstructor
@RestController //obligatoire
public class InscriptionController {
    private IInscriptionService inscriptionService;

    @PostMapping("/addInscription")
    public Inscription addInscription(@RequestBody Inscription inscription) {
        return inscriptionService.addInscription(inscription);
    }

    @PutMapping("/updateInscription")
    public Inscription updateInscription(@RequestBody Inscription inscription) {
        return inscriptionService.updateInscription(inscription);
    }

    @GetMapping("/getAllInscription")
    public List<Inscription> getAllInscription() {
        return inscriptionService.retrieveAllInscriptions();
    }
    @GetMapping("/getInscription/{idI}")
    public Inscription getInscription(@PathVariable long idI) {
        return inscriptionService.retrieveInscriptionById(idI);
    }

    @DeleteMapping("/delete/{idI}")
    public void deleteInscription(@PathVariable long idI) {
        inscriptionService.deleteInscriptionById(idI);
    }

    @PostMapping("/AddInscriAndAsignToSkieur/{numSkieur}")
    public Inscription AddInscriAndAsignToSkieur(@RequestBody Inscription inscription,@PathVariable long numSkieur) {
        return inscriptionService.AddInscriAndAssignToSkieur(inscription,numSkieur);

    }

    @PostMapping("/AddInscriptionAndAssingToCours/{idCours}")
    public Inscription AddInscriAndAsignToCours(@RequestBody Inscription inscription,@PathVariable long idCours) {
        return inscriptionService.AddInscriptionAndAssingToCours(inscription,idCours);
    }
}
