package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //navegue na lista exibindo cada nome no console
        for(String nome: nomes) {
            System.out.println(nome);
        }

        //substitua nome Carlos por Roberto
        nomes.set(2, "Roberto");
        System.out.println(nomes);

        //retorne o nome da posicao 1
        String nome = nomes.get(1);
        System.out.println(nome);

        //remova o nome da posicao 4
        nomes.remove(4);
        System.out.println(nomes);

        //remova o nome Joao
        nomes.remove("João");
        System.out.println(nomes);

        //retorne a quantidade de itens na lista
        int quantidade = nomes.size();
        System.out.println(quantidade);

        //verifique se o nome Juliano existe
        boolean temJuliano = nomes.contains("Juliano");
        System.out.println(temJuliano);

        //crie uma nova lista com os nomes Ismael e Rodrigo.
        // Adicione todos os itens da nova lista na primeira lista
        // Ordene os itens da lista por ordem alfabetica

        List<String> novosNomes = new ArrayList<>();

        novosNomes.add("Ismael");
        novosNomes.add("Rodrigo");

        nomes.addAll(novosNomes);
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

    }

}
