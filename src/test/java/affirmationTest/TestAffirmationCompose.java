package affirmationTest;

import com.hei.school.Affirmation;
import com.hei.school.AffirmationCompose;
import com.hei.school.AffirmationSimple;
import com.hei.school.Conjonction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestAffirmationCompose {
    @Test
    public void testAffirmationComposePeutEtreVraie() {
        Affirmation gauche = new AffirmationSimple("Gauche", "true");
        Affirmation droite = new AffirmationSimple("Droite", "false");
        AffirmationCompose affirmation = new AffirmationCompose("Test", gauche, droite, Conjonction.Et);
        assertEquals("faux", affirmation.peutEtreVraie());
    }
}
