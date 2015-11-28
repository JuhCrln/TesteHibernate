import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BuscaTarefas {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();

		// cuidado, use o import javax.persistence.Query
		String descrição = "Estudar JPA e Hibernate";
		Query query = manager.createQuery("select t from Tarefa as t where t.descricao = :paramDescricao");
		query.setParameter("paramDescricao", descrição);

		@SuppressWarnings("unchecked")
		List<Tarefa> lista = query.getResultList();

		for (Tarefa t : lista) {
			System.out.println(t.getDescricao());
		}

		manager.close();
	}
}