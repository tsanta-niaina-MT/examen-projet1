package com.hei.school;

import lombok.Getter;

@Getter
public final class Mensonge extends Affirmation{
    public Mensonge(String texte) {
        super(texte);
    }

    @Override
    public String peutEtreVraie() {
        return "false";
    }
}
