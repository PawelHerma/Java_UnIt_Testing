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
    @Test
    public void AlfabetTest3()
    {
        char[] znaczki = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] oczekiwania = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        int[] rzeczywistości = new int[26];
        for (int i = 0; i < 26; i++)
        {
            rzeczywistości[i] = Alfabet.numerek(znaczki[i]);
            assertEquals(oczekiwania[i], rzeczywistości[i]);
        }
    }
}
