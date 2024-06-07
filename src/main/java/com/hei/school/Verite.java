package com.hei.school;

import lombok.Getter;
@Getter
public final class Verite extends Affirmation{
    public Verite(String texte) {
        super(texte);
    }

    @Override
    public String peutEtreVraie() {
        return "true";
    }
}
