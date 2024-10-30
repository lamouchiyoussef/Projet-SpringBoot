package tn.esprit.sprinproject.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprinproject.entity.Cours;
import tn.esprit.sprinproject.services.ICoursService;

import java.util.List;


@AllArgsConstructor
@RestController //obligatoire
public class CoursRestController {

    private ICoursService iCoursService;

    @PostMapping("/addCours")
    public Cours addCours(@RequestBody Cours cours) {
        return iCoursService.addCours(cours);
    }

    @PutMapping("/updateCours")
    public Cours updateCours(@RequestBody Cours cours) {
        return iCoursService.updateCours(cours);
    }

    @GetMapping("/getAllCours")
    public List<Cours> getAllCours() {
        return iCoursService.retrieveAllCours();
    }

    @GetMapping("/getCours/{idC}")
    public Cours getCours(@PathVariable int idC) {
        return iCoursService.retrieveCoursById(idC);
    }

    @DeleteMapping("/deleteCours/{idC}")
    public void deleteCours(@PathVariable int idC) {
        iCoursService.deleteCoursById(idC);
    }
}
