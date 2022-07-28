package set;

import java.util.HashSet;

public class ExercicioHashSet {
    public static void main(String[] args) {
        //crie um set e adicione 5 numeros inteiros: 3, 88, 20, 44, 3
        HashSet<Integer> listaNumeros = new HashSet<>();

        listaNumeros.add(3);
        listaNumeros.add(88);
        listaNumeros.add(20);
        listaNumeros.add(44);
        listaNumeros.add(3);


        //navegue no set exibindo cada numero no console
        for (Integer numero : listaNumeros) {
            System.out.println(numero);
        }

        //remova o primeiro item do set
        listaNumeros.remove(3);
        System.out.println(listaNumeros);

        //adicione um novo numero no set: 23
        listaNumeros.add(23);
        System.out.println(listaNumeros);

        //verifique o tamanho do set
        Integer tamanho = listaNumeros.size();
        System.out.println(tamanho);

        //verifique se o set esta vazio
        Boolean verificaVazio = listaNumeros.isEmpty();
        System.out.println(verificaVazio);

    }
}
