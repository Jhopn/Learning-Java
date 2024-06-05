import java.util.Arrays;
import java.util.List;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "Javascript", "PHP");
        // Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
        // palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);

        palavras.stream().filter( palavra -> palavra.length() > 5).forEach(System.out::println);

    }
}
