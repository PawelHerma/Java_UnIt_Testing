package main.java;

public class App 
{
    public static int dodaj(int a, int b)
    {
        return a + b;
    }
    public static int sumaCyfr(int n)
    {
        if ( n % 10 == n )
        {
            return n;
        }
        else
            return n % 10 + sumaCyfr(n / 10);
    }
    public static char[] alfabet()
    {
        char[] tab = new char[26];
        for ( int i = 97 ; i < 123 ; i++ )
        {
            tab[i - 97] = (char) i;
        }
        return tab;
    }
    public static boolean czyPierwsza(int liczba)
    {
        boolean czyPierwsza = true;
        for (int i = 2; i < Math.sqrt(liczba); i++)
        {
            if (liczba % i == 0)
            {
                czyPierwsza = false;
            }
        }
        return czyPierwsza;
    }
}
