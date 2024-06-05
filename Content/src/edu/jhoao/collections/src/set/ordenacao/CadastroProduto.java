package set.ordenacao;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import set.ordenacao.comparator.ComparatorPorPreco;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco; 
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto( 1L, "Produto 1", 9.3, 6 );
        cadastroProduto.adicionarProduto( 5L, "Produto 2", 10, 1 );
        cadastroProduto.adicionarProduto( 6L, "Produto 3", 13, 3 );
        cadastroProduto.adicionarProduto( 1L, "Produto 4", 100, 2 );

        System.out.println(cadastroProduto.exibirProdutoPorNome());
        System.out.println(cadastroProduto.exibirProdutoPorPreco());
    }


}
