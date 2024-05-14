package candidatura;
import java.util.Random;
import java.util.concurrent.*;

public class ProcessoSeletivo{
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");

        String [] candidatos = {"Felipe", "Marcia", "Julia", "Jhoão", "Caíque"};

        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }

    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            } else{
                System.out.println("Contato Realizado!");
            }
            tentativasRealizadas++;
        } while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com o candidato " + candidato +" na tentativa número " + tentativasRealizadas );
        } else{
            System.out.println("Não conseguimos contato com o candidato " + candidato);
        }
    }
    static void selecionaCandidato(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Jhoão", "Caíque"};
        double salarioBase = 2000.0;

        int cadidatosSelecionados = 0;
        int candidatoAtual = 0;
        while(cadidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioCandidato = valorPretendido();
            System.out.println("O candidato "+ candidato+ " solicitou: R$: "+ salarioCandidato);

            if(salarioBase >= salarioCandidato){
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga");
                cadidatosSelecionados++;
            } else{
                System.err.println("O candidato " + candidato + " não foi selecionado.");
            }
            candidatoAtual++;
        }

    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO PARA CONTRA PROPOSTA");
        } else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    } 
    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Jhoão", "Caíque"};
        
        System.out.println("Candidatos selecionados");

        for (String selecionado : candidatos){
            System.out.println(" -  " + selecionado );
        }
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

}