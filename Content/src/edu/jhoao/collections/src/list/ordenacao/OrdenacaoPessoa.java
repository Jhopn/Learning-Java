package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import list.ordenacao.Pessoa.ComparatorPorAltura;
import list.ordenacao.Pessoa.Pessoas;


public class OrdenacaoPessoa{
    private List<Pessoas> pessoasList;

    public OrdenacaoPessoa() {
        this.pessoasList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoas(nome,  idade,  altura));
    }
    public List<Pessoas> ordenarPorIdade(){
        List<Pessoas> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoas> ordenarPorAltura(){
        List<Pessoas> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaopessoa = new OrdenacaoPessoa();
        ordenacaopessoa.adicionarPessoa("Nome 1", 32, 1.43);
        ordenacaopessoa.adicionarPessoa("Nome 2", 14, 1.78);
        ordenacaopessoa.adicionarPessoa("Nome 3", 21, 1.83);
        ordenacaopessoa.adicionarPessoa("Nome 4", 12, 1.93);
        ordenacaopessoa.adicionarPessoa("Nome 5", 24, 1.63);
        

        System.out.println(ordenacaopessoa.ordenarPorIdade());
        System.out.println(ordenacaopessoa.ordenarPorAltura());
    }

}
