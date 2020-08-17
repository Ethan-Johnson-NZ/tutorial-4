package cidemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class CalcTest 
{
    @Test
    public void testCalcAdd()
    {
        assertTrue( Calc.add(5, 2) == 7 );
    }
    
    public void testCalcSubtract()
    {
        assertTrue( Calc.subtract(5, 2) == 3 );
    }
}
