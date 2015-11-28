import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TarefaDAO {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
	private EntityManager manager = factory.createEntityManager();
	
	public void adciona (Tarefa tarefa){
		manager.getTransaction().begin();
		manager.persist(tarefa);
		manager.getTransaction().commit();
	}
	
	public void atualiza(Tarefa tarefa){
		manager.getTransaction().begin();
		manager.merge(tarefa);
		manager.getTransaction().commit();
	}
	
	public void remove (Long id){
		Tarefa encontrada = manager.find(Tarefa.class, id);
		manager.getTransaction().begin();
		manager.remove(encontrada);
		manager.getTransaction().commit();
	}
	
	public List<Tarefa> buscaDescricao(String descricao){
		Query query = manager.createQuery("select t from Tarefa as t where t.descricao = :paramDescricao");
		query.setParameter("paramDescricao", descricao);
		@SuppressWarnings("unchecked")
		List<Tarefa> lista = query.getResultList();
		return lista;
	}
	
	public Tarefa buscaID(Long id){
		Tarefa encontrada = manager.find(Tarefa.class, id);
		return encontrada;
	}
}
