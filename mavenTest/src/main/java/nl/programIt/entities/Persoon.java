package nl.programIt.entities;
/*@Autor: Baddi
 * gemaakt op 24-8-20016
 **/
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
//class Jpa
public class Persoon {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long idPersoon;
	private String firstName;
	private String lastName;
	@Temporal(TemporalType.DATE)
	private Date dateBirth;
	
	//Getters en setters
	public Long getIdPersoon() {
		return idPersoon;
	}
	public void setIdPersoon(Long idPersoon) {
		this.idPersoon = idPersoon;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDateBirth() {
		return dateBirth;
	}


	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}


	public Persoon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persoon(String firstName, String lastName,
			Date dateBirth) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateBirth = dateBirth;
	}

}
