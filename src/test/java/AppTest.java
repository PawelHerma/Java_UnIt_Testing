package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.App;


public class AppTest 
{
    @Test
    public void dodajTest()
    {
        assertEquals(4, App.dodaj(2, 2));
        assertEquals(5, App.dodaj(2, 3));
    }

    @Test
    public void sumaCyfrTest()
    {
        assertEquals(15, App.sumaCyfr(12345));
        assertEquals(21, App.sumaCyfr(123456));
    }

    @Test
    public void alfabetTest()
    {
        final char[] alfabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i = 0; i < alfabet.length ; i++) 
        {
            assertEquals(alfabet[i], App.alfabet()[i]);
        }
    }

    @Test
    public void czyPierwszaTest()
    {
        assertEquals(true, App.czyPierwsza(23));
        assertEquals(false, App.czyPierwsza(12));
    }
}
