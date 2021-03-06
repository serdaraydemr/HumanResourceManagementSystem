package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobTitle;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Service
public class JobTitleManager implements JobTitleService {
	
	@Autowired
	private JobTitleDao jobTitleDao;

	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(), "Job Titles are Listed.");
	}


	@Override
	public Result add(JobTitle jobTitle) {
		if(this.jobTitleDao.existsByTitle(jobTitle.getTitle())) {
			return new ErrorResult("Pozisyon kullanımda.");
		}
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("Job Title is Added.");
	}
	


}
