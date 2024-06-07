package affirmationTest;

import com.hei.school.Affirmation;
import com.hei.school.AffirmationCompose;
import com.hei.school.AffirmationSimple;
import com.hei.school.Conjonction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAffirmationComposeAvecDonc {
    private void verifierAffirmation(String valeurAttendue, String valeurRetournee) {
        assertEquals(valeurAttendue, valeurRetournee);
    }
    @Test
    public void testAffirmationComposePeutEtreVraieDonc() {
        Affirmation gauche = new AffirmationSimple("Gauche", "true");
        Affirmation droite = new AffirmationSimple("Droite", "false");
        AffirmationCompose affirmation = new AffirmationCompose("Test", gauche, droite, Conjonction.Donc);
        verifierAffirmation("vrai", affirmation.peutEtreVraie());
    }

}
