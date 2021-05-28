package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;
import kodlamaio.hrms.entities.concretes.Candidate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
	
	List<Candidate> findAllByEmail(String email);
	List<Candidate> findAllByIdentificationNumber(String identificationNumber);

}
