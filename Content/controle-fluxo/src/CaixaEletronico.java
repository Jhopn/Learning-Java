public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 35.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado > saldo){
            System.out.println("Saldo indisponivel!");
        } else {
            saldo = saldo - valorSolicitado;
            System.out.println(" R$" +saldo + "é o novo saldo atual!");
        }
    }
}
