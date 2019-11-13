package hearth.software.demomaven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldReturnFiveForAdditionBetween2and3(){
        App app = new App();
        int a = 2;
        int b = 3;
        int resultat = a + b;
        assertEquals(app.addition(a, b), resultat);
    }
}
