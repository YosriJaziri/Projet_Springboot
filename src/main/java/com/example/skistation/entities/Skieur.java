package com.example.skistation.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;
    @ManyToMany(mappedBy = "skieurs")
    private List<Piste> pistes;
    @OneToOne
    private Abonnement abonnement;
    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;
}
