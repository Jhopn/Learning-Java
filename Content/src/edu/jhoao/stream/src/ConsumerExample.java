import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1,4,3,5,6,8,10);

        // Consumer<Integer> imprimirNumeroPar = numero -> { 
        //     if(numero % 2 == 0) {
        //         System.out.println("Número tal: " + numero);
        //     }
        // };

        // numeros.stream().forEach(imprimirNumeroPar);

        numeros.forEach( n ->{
                if(n % 2 == 0) {
                    System.out.println("Número tal: " + n);
                }
            }
        );
    }
}

