package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilies.results.Result;
import kodlamaio.hrms.entities.concretes.EmailVerification;

//import kodlamaio.hrms.entities.concretes.User;

public interface EmailVerificationService {

	void generateCode(EmailVerification code, Integer id);
	Result verify(String verificationCode, Integer id);
}
