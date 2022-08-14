package tut.four;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TestCalc 
{    
    private final Calc calculator = new Calc();

    @Test
    public void testadd()
    {
        assertEquals(5, calculator.add(3,2));
    }

    @public void testsub(){
        assertEquals(2, calculator.subtract(5,3));
    }
}


