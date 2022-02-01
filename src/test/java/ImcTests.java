import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ImcTests {

    Imc imc;

    @BeforeEach
    void setup(){
        imc = new Imc(0,0,true);
    }

    @Test
    void homemAbaixoDoPeso(){
        imc.setPeso(30);
        imc.setAltura(1.8);
        imc.setHomem(true);
        imc.calcImc();

        assertEquals("abaixo do peso", imc.getResultado());
    }

    @Test
    void homemPesoNormal(){
        imc.setPeso(80);
        imc.setAltura(1.8);
        imc.setHomem(true);
        imc.calcImc();

        assertEquals("no peso normal", imc.getResultado());
    }

    @Test
    void homemPoucoAcimaDoPeso(){
        imc.setPeso(90);
        imc.setAltura(1.8);
        imc.setHomem(true);
        imc.calcImc();

        assertEquals("marginalmente acima do peso", imc.getResultado());
    }

    @Test
    void homemAcimaDoPeso(){
        imc.setPeso(100.5);
        imc.setAltura(1.8);
        imc.setHomem(true);
        imc.calcImc();

        assertEquals("acima do peso ideal", imc.getResultado());
    }

    @Test
    void homemObeso(){
        imc.setPeso(200);
        imc.setAltura(1.8);
        imc.setHomem(true);
        imc.calcImc();

        assertEquals("obeso", imc.getResultado());
    }

    @Test
    void mulherAbaixoDoPeso(){
        imc.setPeso(30);
        imc.setAltura(1.8);
        imc.setHomem(false);
        imc.calcImc();

        assertEquals("abaixo do peso", imc.getResultado());
    }

    @Test
    void mulherPesoNormal(){
        imc.setPeso(80);
        imc.setAltura(1.8);
        imc.setHomem(false);
        imc.calcImc();

        assertEquals("no peso normal", imc.getResultado());
    }

    @Test
    void mulherPoucoAcimaDoPeso(){
        imc.setPeso(88);
        imc.setAltura(1.8);
        imc.setHomem(false);
        imc.calcImc();

        assertEquals("marginalmente acima do peso", imc.getResultado());
    }

    @Test
    void mulherAcimaDoPeso(){
        imc.setPeso(100);
        imc.setAltura(1.8);
        imc.setHomem(false);
        imc.calcImc();

        assertEquals("acima do peso ideal", imc.getResultado());
    }

    @Test
    void mulherObeso(){
        imc.setPeso(200);
        imc.setAltura(1.8);
        imc.setHomem(false);
        imc.calcImc();

        assertEquals("obeso", imc.getResultado());
    }
}
