package TestQuestao01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import questao01.Fatorial;

public class TestFatorial {

	@Test
    public void fatorialCinco() {
        Fatorial f = new Fatorial();
        int esperado = 120;
        int atual = f.CalcFatorial(5);
        assertEquals(esperado, atual);
    }
	
	@Test
    public void fatorialDez() {
        Fatorial f = new Fatorial();
        int esperado = 3628800;
        int atual = f.CalcFatorial(10);
        assertEquals(esperado, atual);
    }
}
