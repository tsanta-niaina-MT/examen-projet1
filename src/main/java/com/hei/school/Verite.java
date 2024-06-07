package com.hei.school;

import lombok.Getter;
@Getter
public final class AffirmationVrai extends Affirmation{
    public AffirmationVrai(String texte) {
        super(texte);
    }
    @Override
    public boolean peutEtreVrai() {
        return true;
    }
}
