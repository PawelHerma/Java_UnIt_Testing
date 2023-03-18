package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Szachy;

public class SzachyTest 
{
    @Test
    public void RuchySkoczkaTest()
    {
        String[] expected = new String[8];
        expected[0] = "B3";
        expected[1] = "C2";
        String[] actual = Szachy.RuchySkoczka("A",1);
        assertArrayEquals(expected, actual);
        // for(int i = 0; i < expected.length; i++)
        // {
        //     assertEquals(expected[i], actual[i]);
        // }
        actual = Szachy.RuchySkoczka("E",5);
        expected[0] = "";
        //TODO: dokonczyc test jednostkowy dla 8 pozycji, ztestowac PodajPozycje()
    }
}
