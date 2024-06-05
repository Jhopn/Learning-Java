package set.ordenacao.comparator;
import java.util.Comparator;

import set.ordenacao.Produto;

public class ComparatorPorPreco implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p1.getPreco());
    }


}