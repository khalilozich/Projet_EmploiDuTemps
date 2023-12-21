package emploi.project.com.service;

import java.util.List;

import emploi.project.com.models.Classe;
import emploi.project.com.models.EmploiDuTemps;
import emploi.project.com.repository.ClasseRepository;
import emploi.project.com.repository.EmploiDuTempsRepository;

public class ClasseServiceImpl implements ClasseService{
	
	ClasseRepository classeRepository;
	EmploiDuTempsRepository emploiRepository;
	@Override
	public void ajouter(Classe C) {
		// TODO Auto-generated method stub
		classeRepository.save(C);
	}

	@Override
	public List<Classe> getClasse() {
		// TODO Auto-generated method stub
		return classeRepository.findAll();
	}

	@Override
	public void supprimer(int idC) {
		// TODO Auto-generated method stub
		classeRepository.deleteById((long) idC);
	}

	@Override
	public void modifier(Classe C) {
		// TODO Auto-generated method stub
		Classe c =classeRepository.getById(C.getId());
		if(c != null)
			classeRepository.save(c);
	}

	@Override
	public Classe getClasse(int idC) {
		// TODO Auto-generated method stub
		return classeRepository.findById((long) idC).get();
	}

	@Override
	public Classe getGroup(String group) {
		// TODO Auto-generated method stub
		return classeRepository.findByGroup(group);
	}

	@Override
	public List<Classe> getNiveau(String niveau) {
		// TODO Auto-generated method stub
		 return (List<Classe>) classeRepository.findByNiveau(niveau);
	}

	@Override
	public void affecterEmploi(int idC, int idE) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		Classe c = classeRepository.findById((long) idC).get();
		EmploiDuTemps E = emploiRepository.findById((long) idE).get();
		if(c != null && E != null ) {
			c.getEmploiDuTemps();
			classeRepository.save(c);
		}
		
	}

}
