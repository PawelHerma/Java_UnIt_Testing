package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.ONP;

public class OnpTest 
{
    ONP onp = ONP.getONP();

    @Test
    public void zakodujTest()
    {
        assertEquals("ab+cd+*", onp.zakoduj("(a + b) * (c + d)"));
    }

    @Test
    public void odkodujTest()
    {
        assertEquals("(a+b)*(c+d)", onp.odkoduj("dc+ba+*"));
    }
}
