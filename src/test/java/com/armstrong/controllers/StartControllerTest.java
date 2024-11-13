package com.armstrong.controllers;

import com.armstrong.controllers.StartController;
import com.armstrong.models.ArmstrongModel;
import com.armstrong.views.View;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StartControllerTest {

    private ArmstrongModel model;
    private View view;
    private StartController controller;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        model = new ArmstrongModel();
        view = new View();
        controller = new StartController();

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testCheckNumber_WithArmstrongNumber() {
        int number = 371;
        
        StartController.checkNumber(number);

        assertEquals("El número 371 es un número de Armstrong.", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCheckNumber_WithNonArmstrongNumber() {
        int number = 351;

        StartController.checkNumber(number);

        assertEquals("El número 351 no es un número de Armstrong.", outputStreamCaptor.toString().trim());
    }
}

