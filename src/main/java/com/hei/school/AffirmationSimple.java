package com.hei.school;

import lombok.Getter;

@Getter
public final class AffirmationSimple extends Affirmation{
    private final String peutEtreVraie;

    public AffirmationSimple(String texte, String peutEtreVraie) {
        super(texte);
        this.peutEtreVraie = peutEtreVraie;
    }

    @Override
    public String peutEtreVraie() {
        boolean isVraie = Boolean.parseBoolean(peutEtreVraie);
        return isVraie ? "vrai" : "faux";
    }
}
