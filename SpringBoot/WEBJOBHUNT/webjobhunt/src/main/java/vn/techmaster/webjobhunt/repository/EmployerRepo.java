package vn.techmaster.webjobhunt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.techmaster.webjobhunt.model.Employer;

@Repository
public interface EmployerRepo extends JpaRepository<Employer, String> {

}
