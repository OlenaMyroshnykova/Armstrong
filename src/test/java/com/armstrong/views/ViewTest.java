package com.armstrong.views;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ViewTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private View view;

    @BeforeEach
    public void setUp() {
        view = new View();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testShowResult() {
        String errorMessage = "Entrada inválida";

        view.showErrorMessage(errorMessage);

        assertEquals("Error: " + errorMessage, outputStreamCaptor.toString().trim());
    }
}
