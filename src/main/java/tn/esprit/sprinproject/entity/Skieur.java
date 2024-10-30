package tn.esprit.sprinproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long num;
    private String nomsk;
    private String prenomsk;
    private LocalDate datenaissance;
    private String ville;


    @OneToOne(cascade = CascadeType.ALL)
    private Abonnement abonnement;

    @OneToMany(mappedBy = "skieur")
    private Set<Inscription> inscriptions;

    @ManyToMany
    @JsonIgnore
    private List<Piste> pistes;
}
