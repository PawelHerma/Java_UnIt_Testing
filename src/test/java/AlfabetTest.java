package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Alfabet;

public class AlfabetTest {
    @Test
    public void AlfabetTest1()
    {
        char znaczek = 'a';
        int oczekiwania = 1;
        int rzeczywistość = Alfabet.numerek(znaczek);

        assertEquals(oczekiwania, rzeczywistość);
    }
    @Test
    public void AlfabetTest2()
    {
        char znaczek = 'w';
        int oczekiwania = 23;
        int rzeczywistość = Alfabet.numerek(znaczek);

        assertEquals(oczekiwania, rzeczywistość);
    }
}
