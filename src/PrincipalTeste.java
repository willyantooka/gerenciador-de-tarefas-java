public class PrincipalTeste {
    public static void main(String[] args){
        GerenciadorTarefas gt = new GerenciadorTarefas();

        gt.adicionarTarefa("Estudar", false);
        gt.listarTarefas();
        gt.concluirTarefa(1);
        gt.listarTarefas();
        gt.removerTarefa(1);
        gt.listarTarefas();
    }
}
