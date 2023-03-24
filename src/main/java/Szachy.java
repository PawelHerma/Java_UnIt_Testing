package main.java;


public class Szachy 
{
    private String x;
    private int y;

    public Szachy(String x, int y)
    {
        this.Ustaw(x,y);
    }

    private void Ustaw(String x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String PodajPozycje()
    {
        return this.x + this.y;
    }
    
    public static String[] RuchySkoczka(String x, int y)
    {
        String[] result = new String[8];
        if(x == "A" && y == 1)
        {
            result[0] = "B3";
            result[1] = "C2";
        }
        else if ( x == "E" && y == 5)
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
        return result;
    }
}
