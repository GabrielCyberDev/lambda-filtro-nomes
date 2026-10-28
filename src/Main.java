import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista de nomes (com e sem "A" no início)
        List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos", "Amanda", "Beatriz", "Alberto");

        // Lambda que implementa a interface FiltroNome
        FiltroNome comecaComA = nome -> nome.startsWith("A");

        System.out.println("Nomes que começam com A:");
        nomes.stream()
                .filter(comecaComA::testar)   // usa a interface própria no filter
                .forEach(System.out::println);
    }
}