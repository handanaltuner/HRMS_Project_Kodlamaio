package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

//import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
//import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
//import lombok.NoArgsConstructor;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
@Table(name="candidates")
@NoArgsConstructor
@AllArgsConstructor



public class Candidate extends User{
	//extends kullanınımı sınıfların birbirlerini miras/kalıtım ( inheritance) olarak kullanımında yer almaktadır. 
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identification_number")
	private String identificationNumber;
	
	@Column(name="birth_date")
	private Date birthDate;



	


	


	
}
