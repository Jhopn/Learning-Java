package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContatos(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;

            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();
        agendaContatos.adicionarContatos("Pedro", 5464577);
        agendaContatos.adicionarContatos("Fernanda", 2344535);
        agendaContatos.adicionarContatos("Lucas", 212354);
        agendaContatos.adicionarContatos("Lucas", 4565467);
        agendaContatos.adicionarContatos("Oslo", 5464577);
        agendaContatos.exibirContatos();
    }

    
}
