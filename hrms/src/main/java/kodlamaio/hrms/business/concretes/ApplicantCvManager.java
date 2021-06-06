package kodlamaio.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ApplicantCvService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.ApplicantCvDao;
import kodlamaio.hrms.entities.concretes.ApplicantCv;

@Service
public class ApplicantCvManager implements ApplicantCvService {
	private ApplicantCvDao applicantCvDao;

	@Autowired
	public ApplicantCvManager(ApplicantCvDao applicantCvDao) {
		super();
		this.applicantCvDao = applicantCvDao;
	}

	@Override
	public DataResult<List<ApplicantCv>> getAll() {

		return new SuccessDataResult<List<ApplicantCv>>(this.applicantCvDao.findAll(), "Özgeçmişler Listelendi !");
	}

	@Override
	public DataResult<List<ApplicantCv>> findByCandidateId(int id) {

		return new SuccessDataResult<List<ApplicantCv>>(this.applicantCvDao.findByCandidateId(id));
	}

	@Override
	public Result add(ApplicantCv applicantCv) {
		this.applicantCvDao.save(applicantCv);
		return new SuccessDataResult<>("Özgeçmiş Başarıyla Eklenmiştir!");
	}

}
