
public class TesteTarefaDAO {
	public static void main(String[] args) {
		TarefaDAO dao = new TarefaDAO();
		Tarefa tarefa = dao.buscaID(3L);
		System.out.println(tarefa);
	}
}
