public class ExemploFor {
    public static void main(String[] args) {
        String alunos[] = {"Jhoão", "Pedro", "Julia", "Vitoria"};

        // for(int i = 0; i<alunos.length; i++){
        //     System.out.println("\n O aluno no indice x = "+ i +" é "+ alunos[i]);
        // }

        // Forma mais simples
        for(String aluno : alunos){
            System.out.println("Nome do Aluno é: " + aluno);
        }
    }
}
