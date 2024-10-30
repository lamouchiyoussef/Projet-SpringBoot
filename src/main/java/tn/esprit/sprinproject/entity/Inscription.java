package tn.esprit.sprinproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInscri;
    private int numSemale;

    @ManyToOne
    @JsonIgnore
    private Skieur skieur;

    @ManyToOne
    @JsonIgnore
    private Cours cours;
}
