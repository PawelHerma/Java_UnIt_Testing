package main.java;

import java.util.NoSuchElementException;
import java.util.Stack;

public class ONP 
{
    public static final ONP onp = new ONP();

    public static ONP getONP()
    {
        return onp;
    }

    public Stack<Character> stos = new Stack<Character>();

    public Stack<String> stos1 = new Stack<String>();

    public String zakoduj(String wyrazenie)
    {
        System.out.println("Wyrazenie: " + wyrazenie);
        char[] wyr = wyrazenie.replaceAll(" ","").toLowerCase().toCharArray();
        String wynik = "";
        stos.clear();
        for (char str : wyr) 
        {
            switch (str)
            {
                case '(':
                {
                    stos.push(str);
                    break;
                }
                case '+':
                {
                    try
                    {
                        if(stos.lastElement() == '*' || stos.lastElement() == '/' || stos.lastElement() == '+' || stos.lastElement() == '-')
                        {
                            wynik += stos.pop();
                        }
                        stos.push(str);
                        break;
                    }
                    catch (NoSuchElementException e)
                    {
                        stos.push(str);
                        break;
                    }
                }
                case '-':
                {
                    try
                    {
                        if(stos.lastElement() == '*' || stos.lastElement() == '/' || stos.lastElement() == '+' || stos.lastElement() == '-')
                        {
                            wynik += stos.pop();
                        }
                        stos.push(str);
                        break;
                    }
                    catch (NoSuchElementException e)
                    {
                        stos.push(str);
                        break;
                    }
                }
                case '/':
                {
                    try
                    {
                        if(stos.lastElement() == '*' || stos.lastElement() == '/')
                        {
                            wynik += stos.pop();
                        }
                        stos.push(str);
                        break;
                    }
                    catch (NoSuchElementException e)
                    {
                        stos.push(str);
                        break;
                    }
                }
                case '*':
                {
                    try
                    {
                        if(stos.lastElement() == '*' || stos.lastElement() == '/')
                        {
                            wynik += stos.pop();
                        }
                        stos.push(str);
                        break;
                    }
                    catch (NoSuchElementException e)
                    {
                        stos.push(str);
                        break;
                    }
                }
                case ')':
                {
                    while(stos.lastElement() != '(')
                    {
                        wynik += stos.pop();
                    }
                    char help = stos.pop();
                    break;
                }
                default:
                {
                    wynik += str;
                    break;
                }
            }
        }
        while(!stos.empty())
        {
            if (stos.lastElement() == '(')
                stos.pop();
            else
                wynik += stos.pop();
        }
        return wynik;
    }
    public String odkoduj(String wyrazenie)
    {
        System.out.println("ONP: " + wyrazenie);
        char[] wyr = wyrazenie.replaceAll(" ","").toLowerCase().toCharArray();
        String wynik = "";
        String pom1,pom2,pom3;
        double p1, p2;
        stos1.clear();
        for (char str : wyr) 
        {
            switch (str)
            {
                case '+':
                {
                    pom1 = stos1.pop();
                    pom2 = stos1.pop();
                    try
                    {
                        p1 = Double.parseDouble(pom1);
                        p2 = Double.parseDouble(pom2);
                        pom3 = String.valueOf(p1 + p2);
                        stos1.push(pom3);
                    }
                    catch (NumberFormatException e)
                    {
                        stos1.push(pom1 + "+" + pom2);
                        break;
                    }
                }
                case '-':
                {
                    pom1 = stos1.pop();
                    pom2 = stos1.pop();
                    try
                    {
                        p1 = Double.parseDouble(pom1);
                        p2 = Double.parseDouble(pom2);
                        pom3 = String.valueOf(p1 - p2);
                        stos1.push(pom3);
                    }
                    catch (NumberFormatException e)
                    {
                        if(pom2.length() > 1)
                            pom2 = "(" + pom2 + ")";
                        stos1.push(pom1 + "-" + pom2);
                        break;
                    }
                }
                case '/':
                {
                    pom1 = stos1.pop();
                    pom2 = stos1.pop();
                    try
                    {
                        p1 = Double.parseDouble(pom1);
                        p2 = Double.parseDouble(pom2);
                        pom3 = String.valueOf(p1 / p2);
                        stos1.push(pom3);
                    }
                    catch (NumberFormatException e)
                    {
                        if(pom1.length() > 1)
                            pom1 = "(" + pom1 + ")";
                        if(pom2.length() > 1)
                            pom2 = "(" + pom2 + ")";
                        stos1.push(pom1 + "/" + pom2);
                        break;
                    }
                }
                case '*':
                {
                    pom1 = stos1.pop();
                    pom2 = stos1.pop();
                    try
                    {
                        p1 = Double.parseDouble(pom1);
                        p2 = Double.parseDouble(pom2);
                        pom3 = String.valueOf(p1 * p2);
                        stos1.push(pom3);
                    }
                    catch (NumberFormatException e)
                    {
                        if(pom1.length() > 1)
                            pom1 = "(" + pom1 + ")";
                        if(pom2.length() > 1)
                            pom2 = "(" + pom2 + ")";
                        stos1.push(pom1 + "*" + pom2);
                        break;
                    }
                }
                default:
                {
                    String s = "" + str;
                    stos1.push(s);
                    break;
                }
            }
        }
        wynik = stos1.pop();
        if (stos1.isEmpty())
            return wynik;
        else
            return "blad";
    }
}
