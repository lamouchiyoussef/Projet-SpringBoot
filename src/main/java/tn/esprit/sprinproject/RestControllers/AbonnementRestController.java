package tn.esprit.sprinproject.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.sprinproject.entity.Abonnement;
import tn.esprit.sprinproject.entity.TypeAbonnement;
import tn.esprit.sprinproject.services.IAbonnementService;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@RestController
public class AbonnementRestController {
private IAbonnementService abonnementService;



@GetMapping("/getAbonnementByType/{type}")
    public List<Abonnement> getAbonnementByType(@PathVariable TypeAbonnement type){
      return   abonnementService.getAbonnementByType(type);
    }
@GetMapping("/getAbonnementByDate/{dateDebut}/{dateFin}")
    public List<Abonnement> getAbonnementByDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateDebut,@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateFin){
    return abonnementService.getAbonnementByDate(dateDebut,dateFin);
    }
}
