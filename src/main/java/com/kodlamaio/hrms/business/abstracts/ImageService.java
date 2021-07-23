package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Image;

public interface ImageService {
	
	Result add(Image image);
	Result delete(int id);
	DataResult<List<Image>> getAll();
	//DataResult<List<Image>> getByImageById(int id);

}
