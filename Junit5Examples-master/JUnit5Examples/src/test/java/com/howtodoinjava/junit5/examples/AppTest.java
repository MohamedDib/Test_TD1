package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    // 1- exécuter avant tous
    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }

    // 2- exe avant chacun
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }
     
    // 3- c'est un test de DEV
    @Test
    void testCalcOne()
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 , Calculator.add(2, 2));
    }

    // 4- c'est un test de prod
    // 6- ignorer ce test
    @Tag("PROD")
    //@Disable
    @Test
    void testCalcTwo()
    {
        System.out.println("======TEST TWO EXECUTED=======");

        // 5- tester l'addition de 4  et 2
        // arrange
        int a = 2;
        int b = 4;

        // act;
        Calculator calculator = new Calculator();
        int somme = calculator.add(a,b);
        //assert
        assertEquals(6,somme);

    }

    // 7- exe après chacun
    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }

    // 8- exex après tous
    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}
