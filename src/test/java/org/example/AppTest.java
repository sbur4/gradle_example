package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void print() {
        Assertions.assertEquals("[<epam>]", App.printer("<epam>"));
    }
}