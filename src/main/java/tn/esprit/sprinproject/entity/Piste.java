package tn.esprit.sprinproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity //Obligatoire
public class Piste implements Serializable { //
    @Id //Obligatoire
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING) //lors de la création enum tu doit generate @enumerated
    private Couleur couleur;
    private int longueur;
    private int pente;

    @ManyToMany(mappedBy = "pistes")
    private List<Skieur> skieurs;

}
