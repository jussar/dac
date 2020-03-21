package percistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import modelo.Funcionario;

public class DAOfuncionario {

	EntityManagerFactory emf;
	EntityManager em;
	
	public void salvar(Funcionario _funcionario) {
	    em.getTransaction().begin();
	    em.persist(_funcionario);
	    em.getTransaction().commit();
	    emf.close();
	}
	
}
