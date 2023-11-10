package sessions;

import java.util.List;

import dao.IDao;
import entities.Filier;
import entities.Student;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class FilierService implements IDao<Filier>{
	@PersistenceContext 
	private EntityManager em;
	
	@Override
	@PermitAll
	public Filier create(Filier o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Filier delete(Filier o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Filier update(Filier o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Filier findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Filier> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
