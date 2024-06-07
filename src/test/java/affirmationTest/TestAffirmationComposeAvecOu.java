package affirmationTest;
import com.hei.school.Affirmation;
import com.hei.school.AffirmationCompose;
import com.hei.school.AffirmationSimple;
import com.hei.school.Conjonction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestAffirmationComposeAvecOu {

    @Test
    public void testAffirmationComposePeutEtreVraieOu() {
        Affirmation gauche = new AffirmationSimple("Gauche", "false");
        Affirmation droite = new AffirmationSimple("Droite", "false");
        AffirmationCompose affirmation = new AffirmationCompose("Test", gauche, droite, Conjonction.Ou);
        assertEquals("faux", affirmation.peutEtreVraie());
    }
}
