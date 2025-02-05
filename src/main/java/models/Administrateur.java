package models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ADMINISTRATEUR")
public class Administrateur extends Profil {
    public void validerEvenement(Evenement evenement) {
        evenement.setEtat("Validé");
    }
}
