package ru.netology.service;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    private CashbackHackService service;

    @Before
    public void setUp() throws Exception {
        this.service = new CashbackHackService();
    }

    @Test
    public void testRemainWithExactThousand() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void testRemainBelowThousand() {
        assertEquals(100, service.remain(900));
    }

    @Test
    public void testRemainAboveThousand() {
        assertEquals(0, service.remain(10000));
    }

    @Test
    public void testRemainJustBeforeNextBoundary() {
        assertEquals(1, service.remain(999));
    }
}