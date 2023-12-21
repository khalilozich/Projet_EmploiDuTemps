package emploi.project.com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Salle {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nom;

	    // Many-to-One association avec Niveau
	    @ManyToOne
	    @JoinColumn(name = "niveau_id")
	    private Niveau niveau;

		public Salle(Long id, String nom, Niveau niveau) {
			super();
			this.id = id;
			this.nom = nom;
			this.niveau = niveau;
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

		public Niveau getNiveau() {
			return niveau;
		}

		public void setNiveau(Niveau niveau) {
			this.niveau = niveau;
		}

}
