import java.util.Optional;

public class App {
    public static void main(String[] args) throws Exception {

        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println(optionalValue.get());

        // String nullableValue = null;
        // Optional<String> optionalValue = Optional.ofNullable(nullableValue);
        // System.out.println(optionalValue.isPresent());

        // Optional<String> optionalValue = Optional.empty();
        // System.out.println(optionalValue.isPresent());

        // Optional<String> optionalValue = Optional.of("Hello");
        // System.out.println(optionalValue.isPresent());

        // Optional<String> optionalValue = Optional.ofNullable(null);
        // System.out.println(optionalValue.isEmpty());

        // Optional<String> optionalValue = Optional.of("Hello");
        // System.out.println(optionalValue.get());

        // Optional<String> optionalValue = Optional.ofNullable(null);
        // String result = optionalValue.orElse("Default"); 
        // System.out.println(result);

        // Optional<String> optionalValue = Optional.ofNullable(null);
        // String result = optionalValue.orElseGet(() -> "Value from Supplier");
        // System.out.println(result);

        // Optional<String> optionalValue = Optional.ofNullable(null);
        // String result = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));

        // Optional<String> optionalValue = Optional.of("Hello");
        // optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));

    }
}
