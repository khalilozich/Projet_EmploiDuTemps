package emploi.project.com.service;

import java.util.List;

import emploi.project.com.models.Classe;

public interface ClasseService {
	
    void ajouter(Classe C );
	
	List<Classe> getClasse();
	
	void supprimer(int idC);
	
	void modifier(Classe C);
	
	Classe getClasse(int idC);
	
	Classe getGroup(String group);
	
	List<Classe> getNiveau(String niveau);

	void affecterEmploi(int idC, int idE);
	

}
