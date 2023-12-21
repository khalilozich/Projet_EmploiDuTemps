package emploi.project.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import emploi.project.com.models.Classe;
 
public interface ClasseRepository extends JpaRepository<Classe , Long>{

	public Classe findByGroup(String group);
	public Classe findByNiveau(String niveau);
	
}
