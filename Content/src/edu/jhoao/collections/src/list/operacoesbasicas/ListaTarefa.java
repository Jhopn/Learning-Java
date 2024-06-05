package list.operacoesbasicas;
import java.util.List;
import java.util.ArrayList;

public class ListaTarefa{
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }
    public void addTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemover = new ArrayList<>();
        for (Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasRemover);

    }
    public int obterNumeroTarefas(){
        return tarefaList.size();
    }
    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }
    public static void main(String[] args) {
        ListaTarefa a = new ListaTarefa();

        a.addTarefa("Estudar React");
        a.addTarefa("Estudar Javascript");
        a.obterDescricaoTarefas();
        a.obterNumeroTarefas();
        a.removerTarefa("Estudar Javascript");
        a.obterDescricaoTarefas();
    }
}