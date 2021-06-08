package kodlamaio.hrms.core.utilities.cloudinary.concretes;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.cloudinary.abstracts.CloudinaryService;
import kodlamaio.hrms.core.utilities.results.DataResult;

@Service
public class CloudinaryManager implements CloudinaryService {

	@Override
	public DataResult<?> save(MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}

}
