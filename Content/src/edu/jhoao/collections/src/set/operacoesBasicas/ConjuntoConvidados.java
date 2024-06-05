package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

import set.operacoesBasicas.convidado.Convidado;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorConvite(int codigoConvite){
        Convidado convidadoRemover = null;
        for(Convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Pedro", 234);
        conjuntoConvidados.adicionarConvidado("Jhõao", 34);
        conjuntoConvidados.adicionarConvidado("Bingo", 64);
        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());
        // conjuntoConvidados.removerConvidadoPorConvite(34);
        conjuntoConvidados.adicionarConvidado("Edro", 34);
        conjuntoConvidados.exibirConvidados();
    }

}
