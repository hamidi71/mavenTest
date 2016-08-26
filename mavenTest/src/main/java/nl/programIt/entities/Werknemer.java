package nl.programIt.entities;
/*@Autor: Baddi
 * gemaakt op 20-8-20016
 **/
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//class Jpa (Persoon)
@Entity
public class Werknemer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long idWerknemer;
	private String voorNaam;
	private String achterNaam;
	@Temporal(TemporalType.DATE)
	private Date geboorteDatum;
	private String email;
	private String wachtwoord;
	private String functie;	
	
	//Getters en setters	
	public Long getIdWerknemer() {
		return idWerknemer;
	}
	public void setIdWerknemer(Long idWerknemer) {
		this.idWerknemer = idWerknemer;
	}
	public String getVoorNaam() {
		return voorNaam;
	}
	public void setVoorNaam(String voorNaam) {
		this.voorNaam = voorNaam;
	}
	public String getAchterNaam() {
		return achterNaam;
	}
	public void setAchterNaam(String achterNaam) {
		this.achterNaam = achterNaam;
	}
	public Date getGeboorteDatum() {
		return geboorteDatum;
	}
	public void setGeboorteDatum(Date geboorteDatum) {
		this.geboorteDatum = geboorteDatum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWachtwoord() {
		return wachtwoord;
	}
	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
	public String getFunctie() {
		return functie;
	}
	public void setFunctie(String functie) {
		this.functie = functie;
	}
	//constructor zonder parameters from superclass
	public Werknemer() {
		super();		
	}
	//constructor met parameters
	public Werknemer(String voorNaam, String achterNaam, Date geboorteDatum
			, String functie,String email) {
		super();
		this.voorNaam = voorNaam;
		this.achterNaam = achterNaam;
		this.geboorteDatum = geboorteDatum;
		this.email = email;
		this.functie = functie;
	}
	
	
	
}
