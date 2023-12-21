package emploi.project.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import emploi.project.com.models.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {

}
