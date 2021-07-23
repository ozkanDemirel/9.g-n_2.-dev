package com.kodlamaio.hrms.business.concretes;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.ExperienceService;
import com.kodlamaio.hrms.business.abstracts.ForeignLanguageService;
import com.kodlamaio.hrms.business.abstracts.JobSeekerService;
import com.kodlamaio.hrms.business.abstracts.LinkService;
import com.kodlamaio.hrms.business.abstracts.ProgrammingSkillService;
import com.kodlamaio.hrms.business.abstracts.SchoolService;
import com.kodlamaio.hrms.business.abstracts.TechnologyService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.ErrorResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.core.validations.abstracts.EmailValidatorService;
import com.kodlamaio.hrms.core.validations.abstracts.JobSeekerCheckService;
import com.kodlamaio.hrms.core.validations.concretes.EmailValidatorManager;
import com.kodlamaio.hrms.core.validations.concretes.JobSeekerCheckManager;
import com.kodlamaio.hrms.core.validations.concretes.RegisterControl;
import com.kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import com.kodlamaio.hrms.entities.concretes.JobSeeker;
import com.kodlamaio.hrms.entities.dtos.CvDto;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;
	private JobSeekerCheckService check;
	private EmailValidatorService emailValidatorService;
	private ExperienceService experienceService;
	private ForeignLanguageService foreignLanguageService;
	private LinkService linkService;
	private ProgrammingSkillService programmingSkillService;
	private SchoolService schoolService;
	private TechnologyService technologyService;
	

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, ExperienceService experienceService, ForeignLanguageService foreignLanguageService,
			LinkService linkService, ProgrammingSkillService programmingSkillService, SchoolService schoolService, TechnologyService technologyService ) {
		this.jobSeekerDao = jobSeekerDao;
		this.check = new JobSeekerCheckManager();
		this.emailValidatorService = new EmailValidatorManager();
		this.experienceService = experienceService;
		this.foreignLanguageService= foreignLanguageService;
		this.linkService = linkService;
		this.programmingSkillService= programmingSkillService;
		this.schoolService= schoolService;
		this.technologyService=technologyService;
		}

	@Override
	public DataResult<List<JobSeeker>> getAll() {

		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "Data Listelendi");
	}

	@Override
	public Result register(JobSeeker jobSeeker) throws NumberFormatException, RemoteException {

		if (check.CheckIfRealPerson(jobSeeker) == false) {
			return new ErrorResult("Bilgiler Doğru Değil");
		} 
		else if(!RegisterControl.isCheckEmail(jobSeeker)) {
			return new ErrorResult("Email Alanını Kontrol Ediniz.");
		}
		
		else {
			emailValidatorService.sendMail(jobSeeker);
			 if(emailValidatorService.isEmailVerified()==false) {
				return new ErrorResult("Email Doğrulaması Gerekli");
			}else {
				jobSeeker.setVerified(true);
				this.jobSeekerDao.save(jobSeeker);
				return new SuccessResult("Kullanıcı Eklendi");
			}
			
		}

	}

	/*@Override
	public DataResult<JobSeeker> geyByIdentityNumber(String identityNumber) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.geyByIdentityNumber(identityNumber));
	}*/

	/*@Override
	public DataResult<CvDto> getCvById(int id) {
		JobSeeker jobSeeker = this.jobSeekerDao.getById(id);
		CvDto cv = new CvDto();
		cv.experiences=jobSeeker.getExperiences();
		cv.languages=jobSeeker.getForeignLanguages();
		cv.links=jobSeeker.getLinks();
		cv.programingSkills=jobSeeker.getProgrammingSkills();
		cv.schools=jobSeeker.getSchools();
		cv.technologies=jobSeeker.getTeknology();
		return null;
	}*/

	

	
}
