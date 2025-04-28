package queue;

import java.util.LinkedList;

public class Queue<Trem> {
    private LinkedList<Trem> fila;


    public Queue() {
        this.fila = new LinkedList<>();
    }

    public boolean estaVazia(){
        return fila.isEmpty();
    }

    public void enfileirar(Trem elemento){
        fila.addLast(elemento);
    }

    public Trem desenfileirar() throws Exception{
        if (estaVazia()){
            throw new Exception("A fila está vazia!");
        }
        return fila.removeFirst();
    }

    public int tamanho(){
        return fila.size();
    }

}
