package map;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, String> estadosBrasileiros = new HashMap<>();

        estadosBrasileiros.put("SP", "São Paulo");
        estadosBrasileiros.put("MA", "Maranhão");
        estadosBrasileiros.put("DF", "Distrito Federal");
        estadosBrasileiros.put("MS", "Mato Grosso do Sul");
        estadosBrasileiros.put("RJ", "Rio de Janeiro");

        System.out.println(estadosBrasileiros);

        estadosBrasileiros.remove("MA");
        System.out.println(estadosBrasileiros);

        Integer tamanho = estadosBrasileiros.size();
        System.out.println(tamanho);

        estadosBrasileiros.remove("MS");
        System.out.println(estadosBrasileiros);

        for(String nome : estadosBrasileiros.keySet()) {
            System.out.println(nome + "(" + estadosBrasileiros.get(nome) + ")");
        }

        Boolean existe = estadosBrasileiros.containsKey("SC");
        System.out.println(existe);

        Boolean existe2 = estadosBrasileiros.containsValue("Maranhão");
        System.out.println(existe2);

    }
}
