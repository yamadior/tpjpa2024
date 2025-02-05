package models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
@DiscriminatorValue("UTILISATEUR")
public class Utilisateur extends Profil {
    @OneToMany(mappedBy = "utilisateur")
    private List<Ticket> tickets;
}