package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper=true)
@PrimaryKeyJoinColumn(name="id")
@Table(name="verification_codes_employers")
public class VerificationCodeEmployer extends VerificationCode{
	//@Id
	//@GeneratedValue
	//@Column(name="id")
	//private int id;
	
	@Column(name="employer_id")
	private int employerId;

}
