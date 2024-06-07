package com.hei.school;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public final class VerificateurDeVerite{
    private final Set<Affirmation> affirmations;

    public VerificateurDeVerite() {
        this.affirmations = new HashSet<>();
    }

    public void ajouterAffirmation(Affirmation affirmation) {
        affirmations.add(affirmation);
    }

    public Set<String> verifierVerite() {
        Set<String> resultats = new HashSet<>();
        for (Affirmation affirmation : affirmations) {
            resultats.add("Affirmation: " + affirmation.getTexte() +
                    " - Résultat: " + affirmation.peutEtreVraie());
        }
        return resultats;
    }
}
