public class Tarefa {
    private int id;
    private String descricao;
    private boolean concluida;

    public Tarefa(int id, String descricao, boolean concluida){
        this.id = id;
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public int getId() { return id; }

    public String getDescricao() { return descricao; }

    public boolean isConcluida() { return concluida; }

    public boolean marcarConcluida(boolean concluida) {
        this.concluida = concluida;
        return concluida;
    }

    public void exibirTarefas(){
        System.out.println(" ===== TAREFAS =====");
        System.out.println(" ID: " + id);
        System.out.println(" Descrição: " + descricao);
        System.out.println(" Status: " + (concluida ? "[concluída]" : "[pendente]"));
        System.out.println(" ===================");
    }
}
