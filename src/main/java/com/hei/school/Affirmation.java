package com.hei.school;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class Affirmation {
    protected final String texte;
    public abstract String peutEtreVraie();
}
