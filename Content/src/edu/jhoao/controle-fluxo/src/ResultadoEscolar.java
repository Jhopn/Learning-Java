public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
    //     if(nota >= 7){
    //         System.out.println("Aprovado");
    //     } else if( nota >= 5 && nota < 7){
    //         System.out.println("Prova de Recuperação");
    //     } 
    //     else {
    //         System.out.println("Reprovado");
    //     }

    // Forma Reduzida - Expressão Ternaria
    String resultado = nota >= 7 ? "Aprovado" : nota < 7 && nota >= 5 ? "Prova de Recuperação" :"Reprovado";
    System.out.println(resultado);
    }
}
