package com.armstrong.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ArmstrongModelTest {

    private ArmstrongModel model;

    @BeforeEach
    public void setUp() {
        model = new ArmstrongModel();
    }

    @Test
    public void testIsArmstrong_PositiveCase_371() {
        int number = 371;
        boolean result = model.isArmstrong(number);
        assertThat("El número 371 debe ser un número de Armstrong.", result, is(true));
    }

    @Test
    public void testIsArmstrong_PositiveCase_1634() {
        int number = 1634;
        boolean result = model.isArmstrong(number);
        assertThat("El número 1634 debe ser un número de Armstrong.", result, is(true));
    }

    @Test
    public void testIsArmstrong_NegativeCase_351() {
        int number = 351;
        boolean result = model.isArmstrong(number);
        assertThat("El número 351 no debe ser un número de Armstrong.", result, is(false));
    }

    @Test
    public void testIsArmstrong_NegativeCase_2015() {
        int number = 2015;
        boolean result = model.isArmstrong(number);
        assertThat("El número 2015 no debe ser un número de Armstrong.", result, is(false));
    }
}

