package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.VerificationCode;

public interface VerificationCodeService {
	DataResult<VerificationCode> getAll();
	Result add(VerificationCode verificationCode);
}
