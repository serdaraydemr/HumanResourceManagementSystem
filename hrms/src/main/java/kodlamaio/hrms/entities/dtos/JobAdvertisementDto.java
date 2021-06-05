package kodlamaio.hrms.entities.dtos;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class JobAdvertisementDto {
	private int id ;
	private String jobDescription;
	private int salary;
	private Date applicationDeadLine;
	private int openPosition;
	private boolean enable;

}
