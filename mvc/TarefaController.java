package mvc;

import java.util.ArrayList;
public class TarefaController {
   private ArrayList<Tarefa> tarefas = new ArrayList<>();
   public void adicionarTarefa(String descricao) {
       Tarefa tarefa = new Tarefa(descricao);
       tarefas.add(tarefa);
   }
   public boolean concluirTarefa(int index) {
       if (index >= 0 && index < tarefas.size()) {
          return tarefas.get(index).tentarConcluir();
       }
      return false ;
   }
   public ArrayList<Tarefa> getTarefasNaoConcluidas() {
       ArrayList<Tarefa> naoConcluidas = new ArrayList<>();
       for (Tarefa tarefa : tarefas) {
           if (!tarefa.isConcluida()) {
               naoConcluidas.add(tarefa);
           }
       }
       return naoConcluidas;
   }
   public ArrayList<Tarefa> getTodasTarefas() {
       return tarefas;
   }
}