package de.fhws;
import static de.fhws.KugelVolumen.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KugelVolumenTest {


    @Test
    void rOneShouldBeFour(){
        var einsKugel = new KugelVolumen();
        assertEquals(4.1, berechneKugelvolumen(1),0.09);
    }

    @Test
    void rZeroShouldNull(){
        assertNull(berechneKugelvolumen(0));
    }
    @Test
    void rFiveShouldFiveHunnit(){
        assertEquals(523.6, berechneKugelvolumen(5), 0.09);
    }

    @Test
    void MinusOne()
    {
        assertEquals(-4.188,berechneKugelvolumen(-1), 0.09);
    }}