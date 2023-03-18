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

    private String PodajPozycje()
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
        return result;
    }
}
