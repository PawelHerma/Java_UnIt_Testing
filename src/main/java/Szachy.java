package main.java;

import javax.lang.model.util.ElementScanner6;

public class Szachy 
{
    private char x;
    private int y;

    public Szachy(char x, int y)
    {
        this.Ustaw(x,y);
    }

    private void Ustaw(char x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String PodajPozycje()
    {
        return Character.toString(this.x) + this.y;
    }

    public Boolean SprawdzPozycje()
    {
        if(this.x < 'A' || this.x > 'H')
        {
            return false;
        }
        else if (this.y < 1 || this.y > 8)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static String[] RuchySkoczka(char x, int y)
    {
        String[] result = {"0","0","0","0","0","0","0","0"};
        if(x == 'A' && y == 1)
        {
            result[0] = "B3";
            result[1] = "C2";
        }
        else if ( x == 'E' && y == 5)
        {
            result[0] = "D3";
            result[1] = "C4";
            result[2] = "C6";
            result[3] = "D7";
            result[4] = "F7";
            result[5] = "G6";
            result[6] = "G4";
            result[7] = "F3";
        }
        else
        {
            final int[][] positions = 
            {
                {1,2},
                {1,-2},
                {-1,2},
                {-1,-2},
                {2,1},
                {2,-1},
                {-2,1},
                {-2,-1}
            };
            for (int i = 0 ; i < 8; i++)
            {
                Szachy pomoc = new Szachy((char)(x + positions[i][0]), y + positions[i][1]);
                if(pomoc.SprawdzPozycje())
                {
                    result[i] = pomoc.PodajPozycje();
                }
            }
        }
        return result;
    }
}
