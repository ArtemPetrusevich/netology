package ru.netology.sqre;

import src.main.Java.SQRService;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void invalidRange() {
        SQRService service = new SQRService();



        long expected = -1;


        long actual = service.rangeSqrt(-200, -300);


        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void validRange() {
        SQRService service = new SQRService();




        long expected = 55;


        long actual = service.rangeSqrt(2000, 10000);


        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sameRange() {
        SQRService service = new SQRService();




        long expected = -1;


        long actual = service.rangeSqrt(10000, 10000);


        assertEquals(expected, actual);
    }


}
