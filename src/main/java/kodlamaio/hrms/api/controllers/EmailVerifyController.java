package kodlamaio.hrms.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import kodlamaio.hrms.business.abstracts.EmailVerificationService;

import kodlamaio.hrms.core.utilies.results.Result;


//Email dogrulama


	@RestController
	@RequestMapping("/api/verify")
	public class EmailVerifyController{
		private EmailVerificationService  emailVerificationService;
		
@Autowired
public EmailVerifyController(EmailVerificationService emailVerificationService) {
	super();
	this.emailVerificationService = emailVerificationService;
	
}
	
@PostMapping("/update/{verificationCode}/{id}")	
		public Result setVerify(@RequestParam String verificationCode, @RequestParam Integer id) {
			return emailVerificationService.verify(verificationCode,id);
}	

		
	}
	

