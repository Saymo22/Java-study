package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import TiposPrimitivos.Primitivos;

public class PrimitivosTest {
     
    @Test
    public void deve_printar_o_texto_na_tela() {
        String call = Primitivos.Print("Raio");
        assertEquals(call, "Raio");
    }

    @Test
    public void deve_somar_dois_inteiros() {
        int valor1 = 15;
        int valor2 = 35;

        int call = Primitivos.Soma(valor1, valor2);

        assertEquals(call, 50);
        
    }
}
