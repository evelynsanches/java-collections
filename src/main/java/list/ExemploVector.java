package list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        //Adiciona 4 esportes no vetor

        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Tênis de mesa");
        esportes.add("Handball");
        System.out.println(esportes);

        //altera valor da posicao 2 do vetor
        esportes.set(2, "Ping pong");

        //remove o esporte da posicao 2
        esportes.remove(2);

        //remove handball do vetor
        esportes.remove("Handball");

        //retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        //navega nos esportes
        for (String esporte: esportes) {
            System.out.println(esporte);
        }

    }
}
