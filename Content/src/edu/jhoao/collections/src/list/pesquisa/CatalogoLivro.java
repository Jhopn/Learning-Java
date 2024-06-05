package list.pesquisa;

import java.util.ArrayList;
import java.util.List;
import list.pesquisa.livro.Livro;


public class CatalogoLivro {
    private List<Livro> livroList;

    public CatalogoLivro(){
        this.livroList = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro li: livroList){
                if(li.getAutor().equalsIgnoreCase(autor)){
                    livrosAutor.add(li);
                }
            }
        }
        return livrosAutor;

    }

    public List<Livro> pesquisarPorAnos(int anoInicial, int anoFinal){
        List<Livro> livrosIntervaloAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosIntervaloAno.add(l);
                }
            }

        }
        return livrosIntervaloAno;
    }

    public Livro pesquisarTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
        
    }

    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        catalogoLivro.adicionarLivro("Livro 1", "Pedro", 2020);
        catalogoLivro.adicionarLivro("Livro 2", "Jhõao", 2010);
        catalogoLivro.adicionarLivro("Livro 3", "Silva", 2022);
        catalogoLivro.adicionarLivro("Livro 5", "Silva", 2022);
        catalogoLivro.adicionarLivro("Livro 6", "Santos", 2021);

        System.out.println(catalogoLivro.pesquisarTitulo("Livro 3"));
        System.out.println(catalogoLivro.pesquisarPorAutor("Silva"));
        System.out.println(catalogoLivro.pesquisarPorAnos(2012, 2021));
    }
    
}
