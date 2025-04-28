package test;

import stack.Stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void deveEmpilharUmElemento(){
        Stack<String> pilha = new Stack<>();
        pilha.empilhar("Moto");

        assertEquals(1,pilha.tamanho());
    }

    @Test
    public void deveDesempilharUmElemento() throws Exception {
        Stack<String>pilha = new Stack<>();
        pilha.empilhar("Barco");
        pilha.empilhar("Carro");
        pilha.empilhar("Moto");

        String itemDesempilhado = pilha.desempilhar();

        assertEquals("Moto", itemDesempilhado);

        assertEquals(2,pilha.tamanho());
    }

    @Test
    public void estaVazia(){
        Stack<String>pilha = new Stack<>();

            assertTrue(pilha.estaVazia());
            pilha.empilhar("Carro");

            assertFalse(pilha.estaVazia());

    }

    @Test
    public void testaSeTopoEstaAumentando(){
        Stack<String>pilha = new Stack<>();
        pilha.empilhar("Carro");

        assertEquals(1, pilha.getTopo());

        pilha.empilhar("Moto");

        assertEquals(2, pilha.getTopo());
    }
}
