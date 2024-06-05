package map.pesquisa;

import java.util.HashMap;
import java.util.Map;
import map.pesquisa.produto.Produto;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProduto(){
        this.estoqueProdutoMap = new HashMap<>();
    }
    public void adicionarProduto(Long cod, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(cod, new Produto(nome,  quantidade,  preco));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutoMap);
    }
    public double calcularValorTotalEstoque(){
        double valorTotal = 0d;
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p: estoqueProdutoMap.values()){
                valorTotal += p.getQuantidade() + p.getPreco();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p: estoqueProdutoMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p: estoqueProdutoMap.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }
}
