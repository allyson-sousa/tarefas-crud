package mvc;

import java.util.ArrayList;
public class TarefaView {
   public void mostrarTarefas(ArrayList<Tarefa> tarefas) {
       for (int i = 0; i < tarefas.size(); i++) {
           Tarefa tarefa = tarefas.get(i);
           System.out.println((i + 1) + ". " + tarefa.getDescricao() + " - Concluída: " + tarefa.isConcluida());
       }
   }
}