package vn.techmaster.webjobhunt;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.techmaster.webjobhunt.model.Employer;
import vn.techmaster.webjobhunt.model.Job;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.UUID;

@SpringBootApplication
@AllArgsConstructor
public class WebjobhuntApplication implements CommandLineRunner {

	private EntityManager entityManager;
	public static void main(String[] args) {
		SpringApplication.run(WebjobhuntApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		var employer = Employer.builder().id(UUID.randomUUID().toString()).name("CMC").build();
		var employer1 = Employer.builder().id(UUID.randomUUID().toString()).name("FPT").build();
		var employer2 = Employer.builder().id(UUID.randomUUID().toString()).name("Google").build();
		var employer3 = Employer.builder().id(UUID.randomUUID().toString()).name("Amazon").build();
		var job = Job.builder().id(UUID.randomUUID().toString()).title("Java").employer(employer).build();


		entityManager.persist(employer);
		entityManager.persist(employer1);
		entityManager.persist(employer2);
		entityManager.persist(employer3);


		entityManager.persist(job);
		entityManager.flush();

	}


}
