package emploi.project.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import emploi.project.com.models.Matiere;

public interface MatiereRepository extends JpaRepository<Matiere, Long> {

}
