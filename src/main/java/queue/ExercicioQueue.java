package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {
    public static void main(String[] args) {
        //crie uma fila
        Queue<String> fila = new LinkedList<>();

        //adicione 5 nomes
        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        //navegue na fila exibindo cada nome no console
        for(String pessoa : fila) {
            System.out.println(pessoa);
        }

        //retorne o primeiro item da fila sem remove-lo
        String primeiroDaFila = fila.peek();
        System.out.println(primeiroDaFila);

        //retorne o primeiro item da fila , removendo o mesmo
        String primeiroEremove = fila.poll();
        System.out.println(primeiroEremove);
        System.out.println(fila);

        //adicione um novo nome Daniel, verifique a posicao que o mesmo assumiu na fila
        fila.add("Daniel");
        System.out.println(fila);

        //retorne o tamanho da lista
        int tamanhoFila = fila.size();
        System.out.println(tamanhoFila);


        //verifique se a lista esta vazia
        boolean verificaFila = fila.isEmpty();
        System.out.println(verificaFila);

        //verifique se o nome carlos esta na lista
        boolean verificaNomefila = fila.contains("Carlos");
        System.out.println(verificaNomefila);
    }




}
