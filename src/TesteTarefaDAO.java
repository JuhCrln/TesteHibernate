
public class TesteTarefaDAO {
	public static void main(String[] args) {
		TarefaDAO dao = new TarefaDAO();
		Tarefa tarefa = new Tarefa();
		tarefa = dao.buscaID(5L);
		//tarefa.setDescricao("Ol�");
		//dao.remove(6L);
		//Tarefa novatarefa = new Tarefa();
		//novatarefa.setDescricao("Criando banco com Hibernate");
		//novatarefa.setFinalizado(true);
		//novatarefa.setDataFinalizacao(null);
		//dao.adciona(novatarefa);
		//novatarefa.setDescricao("Ol�");
		dao.atualiza(tarefa);
		//System.out.println(tarefa);
	}
}
