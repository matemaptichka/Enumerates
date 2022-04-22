package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void enumerateFrom200to300() {
        SQRService service = new SQRService();

        assertEquals(3, service.enumerate(200, 300));
    }

    @Test
    void enumerateLessMin() {
        SQRService service = new SQRService();

        assertEquals(0, service.enumerate(1, 99));
    }

    @Test
    void enumerateMoreMax() {
        SQRService service = new SQRService();

        assertEquals(0, service.enumerate(9802, 12000));
    }

    @Test
    void enumerateEqualsMax() {
        SQRService service = new SQRService();

        assertEquals(1, service.enumerate(9801, 9802));

    }

    @Test
    void enumerateEqualsMin() {
        SQRService service = new SQRService();

        assertEquals(1, service.enumerate(0, 100));
    }

    @Test
    void enumerateAll() {
        SQRService service = new SQRService();

        assertEquals(90, service.enumerate(0, 10000));
    }
}