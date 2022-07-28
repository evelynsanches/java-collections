package comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExercicioComparator {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 18));
        estudantes.add(new Estudante("Mariana", 21));

        System.out.println(estudantes);

        //ordem natural dos numeros
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantes);

        //ordem reversa
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println(estudantes);

        //ordem natural dos numeros idade method reference
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes);
    }


}
