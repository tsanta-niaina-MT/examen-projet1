package com.hei.school;

import java.util.stream.Stream;

public final class AffirmationCompose extends Affirmation {
    private final Affirmation gauche;
    private final Affirmation droite;
    private final Conjonction conjonction;

    public AffirmationCompose(String texte, Affirmation gauche, Affirmation droite, Conjonction conjonction) {
        super(texte);
        this.gauche = gauche;
        this.droite = droite;
        this.conjonction = conjonction;
    }

    @Override
    public String peutEtreVraie() {
        String gaucheVal = gauche.peutEtreVraie();
        String droiteVal = droite.peutEtreVraie();

        return switch (conjonction) {
            case Et -> Stream.of(gaucheVal, droiteVal).allMatch(val -> val.equals("vrai")) ? "vrai" : "faux";
            case Ou -> Stream.of(gaucheVal, droiteVal).anyMatch(val -> val.equals("vrai")) ? "vrai" : "faux";
            case Donc -> Stream.of(gaucheVal, droiteVal)
                    .reduce((g, d) -> g.equals("vrai") && d.equals("faux") ? "vrai" : "faux")
                    .orElse("jenesaispas");
            default -> "jenesaispas";
        };
    }
}
