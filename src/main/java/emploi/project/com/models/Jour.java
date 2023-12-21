package emploi.project.com.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Jour {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nom;

	    // One-to-Many association avec Horaire
	    @OneToMany(mappedBy = "jour")
	    private List<Horaire> horaires;

		public Jour(Long id, String nom, List<Horaire> horaires) {
			super();
			this.id = id;
			this.nom = nom;
			this.horaires = horaires;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public List<Horaire> getHoraires() {
			return horaires;
		}

		public void setHoraires(List<Horaire> horaires) {
			this.horaires = horaires;
		}

}
