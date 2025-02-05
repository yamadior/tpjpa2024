package models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Date date;
    private String lieu;
    private int capacite;
    private String description;
    private String etat;
    private int stock;
    private String genre;
    private String artiste;

    @ManyToOne
    @JoinColumn(name = "organisateur_id")
    private Organisateur organisateur;

    @OneToMany(mappedBy = "evenement")
    private List<Ticket> tickets;

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
