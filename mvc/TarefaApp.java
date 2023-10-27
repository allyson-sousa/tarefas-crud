package mvc;

import java.util.ArrayList;
import java.util.Scanner;

public class TarefaApp {
	public static void main(String[] args) {
		TarefaController controller = new TarefaController();
		TarefaView view = new TarefaView();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Escolha uma opção:");
			System.out.println("1. Adicionar Tarefa");
			System.out.println("2. Concluir Tarefa");
			System.out.println("3. Mostrar Tarefas não concluídas");
			System.out.println("4. Mostrar todas as Tarefas");
			System.out.println("0. Sair");
			int opcao = scanner.nextInt();
			scanner.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("Digite a descrição da tarefa:");
				String descricao = scanner.nextLine();
				controller.adicionarTarefa(descricao);
				break;
			case 2:
				System.out.println("Digite o número da tarefa que deseja concluir:");
				int indiceConcluir = scanner.nextInt();
				controller.concluirTarefa(indiceConcluir - 1); 				break;
			case 3:
				ArrayList<Tarefa> naoConcluidas = controller.getTarefasNaoConcluidas();
				view.mostrarTarefas(naoConcluidas);
				break;
			case 4:
				ArrayList<Tarefa> todasTarefas = controller.getTodasTarefas();
				view.mostrarTarefas(todasTarefas);
				break;
			case 0:
				System.out.println("Saindo do aplicativo.");
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		}
	}
}