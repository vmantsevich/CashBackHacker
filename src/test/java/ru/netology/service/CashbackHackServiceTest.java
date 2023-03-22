package ru.netology.service;
import org.testng.Assert;


import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void shouldCalculateIfLess() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;


        Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldCalculateIf1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateIfMore2000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2500;

        int actual = service.remain(amount);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }

}