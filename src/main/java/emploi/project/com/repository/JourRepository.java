package emploi.project.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import emploi.project.com.models.Jour;

public interface JourRepository  extends JpaRepository<Jour, Long>{

}
