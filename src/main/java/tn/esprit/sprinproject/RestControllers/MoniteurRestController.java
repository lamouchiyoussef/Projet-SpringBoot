package tn.esprit.sprinproject.RestControllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprinproject.entity.Moniteur;
import tn.esprit.sprinproject.services.IMoniteurService;

import java.util.List;

@AllArgsConstructor
@RestController //obligatoire
public class MoniteurRestController {
    private IMoniteurService moniteurService;

    @PostMapping("/addMoniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur moniteur) {
        return moniteurService.addMoniteur(moniteur);
    }

    @PutMapping("/updateMoniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur moniteur) {
        return moniteurService.updateMoniteur(moniteur);
    }

    @GetMapping("/getAllMoniteur")
    public List<Moniteur> getAllMoniteur() {
    return moniteurService.retrieveAllMoniteurs();
    }

    @GetMapping("/getMoniteur/{idM}")
    public Moniteur getMoniteur(@PathVariable long idM) {
        return moniteurService.retrieveMoniteurById(idM);
    }

    @DeleteMapping("/deleteMoniteur/{idM}")
    public void deleteMoniteur(@PathVariable long idM) {
        moniteurService.deleteMoniteurById(idM);
    }

    @PostMapping("/addMoniteurAndAssignToCours/{numC}")
    public Moniteur addMoniteurAndAssignToCours(@RequestBody Moniteur moniteur,@PathVariable long numC) {
        return moniteurService.addMoniteurAndAssignToCours(moniteur,numC);
    }
}
