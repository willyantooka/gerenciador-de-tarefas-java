import java.util.Scanner;

public class Principal {
     static void main(String[] args){
        GerenciadorTarefas gt = new GerenciadorTarefas();
        Scanner sc = new Scanner(System.in);
        int op;

        do{
            System.out.println(" ===== PAINEL DE TAREFAS =====");
            System.out.println(" 1 - Adicionar tarefa");
            System.out.println(" 2 - Remover tarefa");
            System.out.println(" 3 - Concluir tarefa");
            System.out.println(" 4 - Listar tarefas");
            System.out.println(" 0 - Sair");
            System.out.println(" =============================");
            System.out.print(" Escolha: ");


            op = Integer.parseInt(sc.nextLine());
            switch (op){
                case 0: {
                    System.out.println(" Saindo...");
                    break;
                }
                case 1: {
                    System.out.println(" ===== ADICIONAR TAREFA =====");
                    System.out.print(" Entre com a descrição da tarefa: ");
                    String descricao = sc.nextLine();
                    System.out.print(" A tarefa já está concluída? (y/n) ");
                    String resposta = sc.nextLine();

                    boolean concluida;
                    if (resposta.equalsIgnoreCase("y")) {
                        concluida = true;
                    } else if (resposta.equalsIgnoreCase("n")) {
                        concluida = false;
                    } else {
                        System.out.println(" Opção inválida!");
                        break;
                    }

                    int id = gt.adicionarTarefa(descricao, concluida);

                    System.out.println(" Tarefa cadastrada com sucesso! " + id);
                    System.out.println(" ============================");
                    break;
                }
                case 2: {
                    System.out.println(" ===== REMOVER TAREFA =====");
                    System.out.print(" Entre com o id da tarefa que deseja remover: ");
                    int id = Integer.parseInt(sc.nextLine());

                    boolean removida = gt.removerTarefa(id);

                    if (removida) {
                        System.out.println(" Tarefa removida com sucesso!");
                    } else {
                        System.out.println(" Tarefa não encontrada.");
                    }
                    System.out.println(" ==========================");
                    break;
                }
                case 3: {
                    System.out.println(" ===== CONCLUIR TAREFA =====");
                    System.out.print(" Entre com o id da tarefa que deseja concluir: ");
                    int id = Integer.parseInt(sc.nextLine());
                    gt.concluirTarefa(id);
                    System.out.println(" ===========================");
                    break;
                }
                case 4: {
                    gt.listarTarefas();
                    break;
                }
                default:
                    System.out.println(" Opcão inválida!");
                    break;
            }
        } while (op != 0);
    }
}
