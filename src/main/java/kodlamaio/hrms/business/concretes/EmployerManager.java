package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	
	@Autowired
	 public EmployerManager(EmployerDao employerDao) {
		 super();
		this.employerDao = employerDao;
	}

	@Override
	public List<Employer> getAll() {
		// TODO Auto-generated method stub
		return this.employerDao.findAll();
	}

}
