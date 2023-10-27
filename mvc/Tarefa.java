package mvc;

public class Tarefa {
   private String descricao;
   private boolean concluida;
   public Tarefa(String descricao) {
       this.descricao = descricao;
       this.concluida = false;
   }
   public String getDescricao() {
       return descricao;
   }
   public boolean isConcluida() {
       return concluida;
   }
   public void concluir() {
       concluida = true;
   }
public boolean tentarConcluir() {
	if(concluida) {
		System.out.println("Tarefa já está concluída");
		return false;
	}else{
		System.out.println("Tarefa concluída!");
		concluida = true;
		return true ;
	}
  }
}