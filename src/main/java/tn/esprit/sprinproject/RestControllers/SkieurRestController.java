package tn.esprit.sprinproject.RestControllers;


import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprinproject.entity.Skieur;
import tn.esprit.sprinproject.entity.TypeAbonnement;
import tn.esprit.sprinproject.services.ISkieurService;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@RestController
public class SkieurRestController {
    private ISkieurService skieurService;


    @PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur skieur) {
        return skieurService.addSkieur(skieur);
    }

    @PutMapping("/updateSkieur")
    public Skieur updateSkieur(@RequestBody Skieur skieur) {
        return skieurService.updateSkieur(skieur);
    }

    @GetMapping("/getAllSkieur")
    public List<Skieur> getAllSkieur() {
        return skieurService.retrieveAllSkieurs();
    }

    @GetMapping("/getSkieur/{idSK}")
    public Skieur getSkieurById(@PathVariable long idSK) {
        return skieurService.retrieveSkieurById(idSK);
    }

    @DeleteMapping("/deleteSkieur/{idSK}")
    public void deleteSkieurById(@PathVariable long idSK) {
        skieurService.deleteSkieurById(idSK);
    }
    @PostMapping("/assignSkieurToPiste/{idSk}/{idPiste}")
    public  Skieur assignSkieurToPiste(@PathVariable long idSk,@PathVariable long idPiste){
            return skieurService.assignSkieurToPiste(idSk,idPiste);

    }
    @GetMapping("/getSkieurByNom/{nomSk}")
    public Skieur getSkieurByNom(@PathVariable String nomSk)
    {
        return skieurService.getSkieurByNom(nomSk);
    }
    @GetMapping("/getSkieurByPrenom/{prenomSk}")
    public Skieur getSkieurByPrenom(@PathVariable String prenomSk)
    {
        return skieurService.getSkieurByPrenom(prenomSk);
    }
    @GetMapping("/getSkieurByDateNaissance/{dateNaissance}")
    public List<Skieur> getSkieurByDateNaissance(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateNaissance)
    {
        return skieurService.getSkieurByDateNaissance(dateNaissance);
    }
    @GetMapping("/getSkieurByNomAndPrenom/{nomSk}/{prenomSk}")
    public Skieur getSkieurByNomAndPrenom(@PathVariable String nomSk,@PathVariable String prenomSk)
    {
        return skieurService.getSkieurByNomAndPrenom(nomSk,prenomSk);
    }
@GetMapping("/getSkieurByTypeAbonnement/{typeAbonnement}")
    public List<Skieur> getSkieurByTypeAbonnement(@PathVariable TypeAbonnement typeAbonnement){
        return skieurService.getSkieurByTypeAbonnement(typeAbonnement);
    }
@GetMapping("/retriveSkieurByVille/{villeSk}")
    public List<Skieur> retriveSkieurByVille(@PathVariable String villeSk){
        return skieurService.retriveSkieurByVille(villeSk);
    }

}
