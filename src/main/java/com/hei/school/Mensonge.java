package com.hei.school;

import lombok.Getter;

@Getter
public final class AffirmationFausse extends Affirmation{
    public AffirmationFausse(String texte) {
        super(texte);
    }

    @Override
    public boolean peutEtreVrai() {
        return false;
    }
}
