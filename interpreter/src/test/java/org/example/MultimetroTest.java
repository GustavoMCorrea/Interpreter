package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultimetroTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Multimetro multimetro = new Multimetro();
        multimetro.setValor1(2.0);
        multimetro.setValor2(5.0);

        assertEquals(10.0, multimetro.calcularTensao());
    }

}