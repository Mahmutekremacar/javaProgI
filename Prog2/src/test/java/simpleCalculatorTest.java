import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class simpleCalculatorTest {

    @Test
    void twoPulsTwoIsFour(){
        var calc = new simpleCalculator();
        assertEquals(4,calc.add(2, 2));
        //assertTrue(calc.add(2,2)==4);

    }

    @Test
    void twoPlusSevenIsNein(){
        var calc = new simpleCalculator();
        assertEquals(9,calc.add(2, 7));
        //assertTrue(calc.add(2,2)==4);

    }

}