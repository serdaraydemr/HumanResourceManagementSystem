package kodlamaio.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ApplicantTalentService;
import kodlamaio.hrms.core.utilities.results.DataResult;

import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.ApplicantTalentDao;

@Service
public class ApplicantTalent implements ApplicantTalentService {
	private ApplicantTalentDao applicantTalentDao;
	
	@Autowired
	public ApplicantTalent(ApplicantTalentDao applicantTalentDao) {
		super();
		this.applicantTalentDao = applicantTalentDao;
	}

	@Override
	public DataResult<List<kodlamaio.hrms.entities.concretes.ApplicantTalent>> getAll() {
		
		return new SuccessDataResult<List<kodlamaio.hrms.entities.concretes.ApplicantTalent>>(this.applicantTalentDao.findAll(),"Yetenekler Listelendi!");
	}

	

	

	

}
