import java.util.ArrayList;

public class GerenciadorTarefas {

    private ArrayList<Tarefa> listaTarefas = new ArrayList<>();
    private int idTarefa;

    public GerenciadorTarefas(){
        this.listaTarefas = new ArrayList<>();
        this.idTarefa = 1;
    }

    public Tarefa buscarId(int id){

        for(Tarefa tarefaAtual: listaTarefas){
            if(tarefaAtual.getId() == id){
                return tarefaAtual;
            }
        }
        return null;
    }

    public int adicionarTarefa(String descricao, boolean concluida){
        Tarefa tarefa =  new Tarefa(idTarefa, descricao, concluida);
        listaTarefas.add(tarefa);
        idTarefa++;
        return tarefa.getId();
    }

    public boolean removerTarefa(int id){
        Tarefa tarefa = buscarId(id);

        if(tarefa != null){
            listaTarefas.remove(tarefa);
            return true;
        }

        return false;
    }

    public void concluirTarefa(int id){
        Tarefa tarefa = buscarId(id);
        if(tarefa != null && !tarefa.isConcluida()){
            tarefa.marcarConcluida(true);
            System.out.println(" Tarefa " + id + " concluída.");
        }
        else if(tarefa != null){
            System.out.println(" Tarefa " + id + " já está concluída.");
        }
        else {
            System.out.println(" Tarefa " + id + " não encontrada.");
        }

    }
    public void listarTarefas(){
        if (listaTarefas.isEmpty()){
            System.out.println(" Nenhuma tarefa cadastrada");
        }
        for(Tarefa tarefaAtual: listaTarefas){
            tarefaAtual.exibirTarefas();
        }
    }
}