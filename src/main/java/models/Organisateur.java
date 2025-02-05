package models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;



@Entity
@DiscriminatorValue("ORGANISATEUR")
public class Organisateur extends Profil {
    @OneToMany(mappedBy = "organisateur")
    private List<Evenement> evenements;
}
