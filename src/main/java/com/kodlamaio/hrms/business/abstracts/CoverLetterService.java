package com.kodlamaio.hrms.business.abstracts;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.CoverLetter;

public interface CoverLetterService {
	
	Result add (CoverLetter voverLetter);
	DataResult<CoverLetter> getById(int id);

}
