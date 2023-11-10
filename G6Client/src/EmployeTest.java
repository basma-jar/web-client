import java.util.Hashtable;  

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


import dao.IDao;
import entities.Employe;
import entities.Student;
import entities.User;

public class EmployeTest {
	
	@SuppressWarnings("unchecked")
	public static IDao<Student> lookUpEmployeRemote() throws NamingException {
		final Hashtable<String, String> jndiProperties = new Hashtable<String, String>();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		final Context context = new InitialContext(jndiProperties);

		return (IDao<Student>) context.lookup("ejb:/G6Serveur/StudentService!dao.IDao");

	}
	public static void main(String[] args) {
		try {
			IDao<Student> dao = lookUpEmployeRemote();
			dao.create(new Student("ali", "ali", "Test3", "Student3", "0607256396", null));
			
			for(Student e : dao.findAll())
				System.out.println(" Login : " + e.getLogin() + "\n Password : " + e.getPassword()+"\n Name : "+ e.getFirstName());
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}