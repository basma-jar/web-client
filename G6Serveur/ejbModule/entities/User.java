package entities;

import java.io.Serializable;
import java.util.*; 

import jakarta.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class  User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -558553967080513790L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String password;
    private String login;
    
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "User_Role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public List<Role> getRoles() {
		return role;
	}

	public void setRoles(List<Role> roles) {
		this.role = roles;
	}

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	public User() {
		super();
	}
	
    
}