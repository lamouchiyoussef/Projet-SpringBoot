package tn.esprit.sprinproject.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprinproject.entity.Piste;
import tn.esprit.sprinproject.services.IPisteService;

import java.util.List;

@AllArgsConstructor
@RestController //obligatoire
public class PisteRestController {
    private IPisteService iPisteService;

    @PostMapping("/addPiste")
    public Piste addPiste(@RequestBody Piste piste){
        return iPisteService.addPiste(piste);
    }
    @PutMapping("/updatePiste")
    public Piste updatePiste(@RequestBody Piste piste){
        return iPisteService.updatePiste(piste);
    }
    @GetMapping("/getAllPiste")
    public List<Piste> retrieveAllPistes(){
        return iPisteService.retrieveAllPistes();
    }
    @GetMapping("/getPiste/{idP}")
    public Piste retrievePisteById(@PathVariable long idP){
        return iPisteService.retrievePisteById(idP);

    }
    @DeleteMapping("/deletePiste/{idp}")
    public void deletePisteById(@PathVariable long idp){
        iPisteService.deletePisteById(idp);
    }

}
