package emploi.project.com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Classe {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String Groupe;

	    // Many-to-One association avec Niveau
	    @ManyToOne
	    @JoinColumn(name = "niveau_id")
	    private Niveau niveau;

	    // Many-to-One association avec EmploiDuTemps
	    @ManyToOne
	    @JoinColumn(name = "emploi_du_temps_id")
	    private EmploiDuTemps emploiDuTemps;

		public Classe(Long id, String groupe, Niveau niveau, EmploiDuTemps emploiDuTemps) {
			super();
			this.id = id;
			Groupe = groupe;
			this.niveau = niveau;
			this.emploiDuTemps = emploiDuTemps;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGroupe() {
			return Groupe;
		}

		public void setGroupe(String groupe) {
			Groupe = groupe;
		}

		public Niveau getNiveau() {
			return niveau;
		}

		public void setNiveau(Niveau niveau) {
			this.niveau = niveau;
		}

		public EmploiDuTemps getEmploiDuTemps() {
			return emploiDuTemps;
		}

		public void setEmploiDuTemps(EmploiDuTemps emploiDuTemps) {
			this.emploiDuTemps = emploiDuTemps;
		}
	    
	    
}
