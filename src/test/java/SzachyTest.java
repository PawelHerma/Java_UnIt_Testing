package test.java;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import main.java.Szachy;

public class SzachyTest 
{
    String[] expected = {"0","0","0","0","0","0","0","0"};
    String[] actual;
    @Test
    public void RuchySkoczkaTest1()
    {
        expected[0] = "B3";
        expected[1] = "C2";
        actual = Szachy.RuchySkoczka('A',1);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void RuchySkoczkaTest2()
    {
        actual = Szachy.RuchySkoczka('E',5);
        expected[0] = "D3";
        expected[1] = "C4";
        expected[2] = "C6";
        expected[3] = "D7";
        expected[4] = "F7";
        expected[5] = "G6";
        expected[6] = "G4";
        expected[7] = "F3";
        assertArrayEquals(expected, actual);
    }
    @Test
    public void RuchySkoczkaTest3()
    {
        actual = Szachy.RuchySkoczka('D', 4);
        expected[0] = "C2";
        expected[1] = "B3";
        expected[2] = "B5";
        expected[3] = "C6";
        expected[4] = "E6";
        expected[5] = "F5";
        expected[6] = "F3";
        expected[7] = "E2";
        Arrays.sort(actual);
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void RuchySkoczkaTest4()
    {
        actual = Szachy.RuchySkoczka('B', 2);
        expected[0] = "A4";
        expected[1] = "C4";
        expected[2] = "D3";
        expected[3] = "D1";
        Arrays.sort(actual);
        Arrays.sort(expected);
        assertEquals(0, Arrays.compare(actual, expected));
    }
    @Test
    public void PodajPozycjeTest()
    {
        String expected = "E5";
        Szachy actualSzachy = new Szachy('E',5);
        String actual = actualSzachy.PodajPozycje();
        assertEquals(expected, actual);
    }
    @Test
    public void SprawdzPozycjeTest()
    {
        Szachy test = new Szachy('A', 1);
        assertTrue(test.SprawdzPozycje());
    }
}
