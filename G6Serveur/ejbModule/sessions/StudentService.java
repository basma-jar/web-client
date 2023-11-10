package sessions;

import java.util.List;

import dao.IDao;
import entities.Employe;
import entities.Student;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.Stateless;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless 
public class StudentService implements IDao<Student>{

	 @PersistenceContext
	 private EntityManager em;
	 
	 @Override
		@PermitAll
		public Student create(Student o) {
			em.persist(o);
			return o;
		}
	 
	 @Override
		public Student delete(Student o) {
			// TODO Auto-generated method stub
			return null;
		}
	 @Override
		public Student update(Student o) {
			// TODO Auto-generated method stub
			return null;
		}
	 
	 @Override
		public Student findById(int id) {
			// TODO Auto-generated method stub
			return null;
		}

	 @Override
		@PermitAll
		public List<Student> findAll() {
			Query query = em.createQuery("select e from Student e");
			return query.getResultList();
		}
}
