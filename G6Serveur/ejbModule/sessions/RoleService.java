package sessions;

import java.util.List;

import dao.IDao;
import entities.Role;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Stateless
public class RoleService implements IDao<Role>{
	
	@PersistenceContext 
	private EntityManager em;

	@Override
	@PermitAll
	public Role create(Role o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role delete(Role o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role update(Role o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
