package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employers")
@Data
public class Employer {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "e_mail")
	private String EMail;
	
	@Column(name = "phone_number")
	private int phoneNumber;
	
	@Column(name = "password")
	private int password;
	
	public Employer() {}
	
	
}
