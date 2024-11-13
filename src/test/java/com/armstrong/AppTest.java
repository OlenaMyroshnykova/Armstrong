package com.armstrong;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @Test
    public void testAppConstructorInit() {
        App app = new App(); 
        assertNotNull(app); 
    }

    @Test
    public void testMainOutput() {
        App.main(new String[]{});

        String expectedOutput = "El número 351 no es un número de Armstrong.\r\n" + 
                        "El número 371 es un número de Armstrong.\r\n" + 
                        "El número 1634 es un número de Armstrong.\r\n" + 
                        "El número 2015 no es un número de Armstrong.";

        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }}
