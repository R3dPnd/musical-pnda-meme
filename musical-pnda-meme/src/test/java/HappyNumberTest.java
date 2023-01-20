import easy.HappyNumber;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HappyNumberTest {

    @Test
    public void test(){
        boolean caseOne = HappyNumber.isHappy(13);
        boolean caseTwo = HappyNumber.isHappy(2);

        assertTrue(caseOne);
        assertFalse(caseTwo);
    }
}
