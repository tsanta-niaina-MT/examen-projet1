package affirmationTest;

import com.hei.school.AffirmationSimple;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class testAffirmationSimple {
    @Test
    public void testAffirmationSimplePeutEtreVraie() {
        AffirmationSimple affirmation = new AffirmationSimple("Test", "true");
        assertEquals("vrai", affirmation.peutEtreVraie());
    }
}
