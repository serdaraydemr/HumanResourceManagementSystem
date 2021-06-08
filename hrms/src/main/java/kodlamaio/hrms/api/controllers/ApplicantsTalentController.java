package kodlamaio.hrms.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrms.business.abstracts.ApplicantTalentService;
import kodlamaio.hrms.core.utilities.results.DataResult;

@RestController
@RequestMapping("/api/applicantTalent")
public class ApplicantsTalentController {
	private ApplicantTalentService applicantTalentService;
	
	@Autowired
	public ApplicantsTalentController(ApplicantTalentService applicantTalentService) {
		super();
		this.applicantTalentService = applicantTalentService;
	}
	@GetMapping("/getAll")
	DataResult<List<kodlamaio.hrms.entities.concretes.ApplicantTalent>> getAll(){
		return this.applicantTalentService.getAll();
				
	}

}
