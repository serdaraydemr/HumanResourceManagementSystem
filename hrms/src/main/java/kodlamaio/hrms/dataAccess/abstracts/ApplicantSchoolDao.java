package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.ApplicantSchool;

public interface ApplicantSchoolDao extends JpaRepository<ApplicantSchool, Integer> {
	List<ApplicantSchool> findByApplicantCvId(int id);

	ApplicantSchool findById(int id);
    @Query("From ApplicantSchool c where applicant_cv_id=:id ORDER BY graduation_date, is_contiune DESC")
	List<ApplicantSchool> getSchoolNameOrderByGraduationDateDesc(int id);

}
