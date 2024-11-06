package com.exemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSoma() {
        Calculadora calc = new Calculadora();
        Assertions.assertEquals(5, calc.somar(2, 3));
    }
}

