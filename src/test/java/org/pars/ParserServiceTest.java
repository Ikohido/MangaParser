package org.pars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserServiceTest {
    ParserService pars;

    @BeforeEach
    public void createParserService() {
        pars = new ParserService(1, 26, 83);
    }

    @Test
    void getNumber1() {
        assertEquals(1, pars.getNumber1());
    }

    @Test
    void setNumber1() {
        pars.setNumber1(4);
        assertEquals(4, pars.getNumber1());
    }

    @Test
    void getNumber2() {
    }

    @Test
    void setNumber2() {
    }

    @Test
    void getNumber3() {
    }

    @Test
    void setNumber3() {
    }
}