package emploi.project.com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Matiere {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nom;

	    // Many-to-One association avec Enseignant
	    @ManyToOne
	    @JoinColumn(name = "enseignant_id")
	    private Enseignant enseignant;

	    // Many-to-One association avec Niveau
	    @ManyToOne
	    @JoinColumn(name = "niveau_id")
	    private Niveau niveau;

		public Matiere(Long id, String nom, Enseignant enseignant, Niveau niveau) {
			super();
			this.id = id;
			this.nom = nom;
			this.enseignant = enseignant;
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

		public Enseignant getEnseignant() {
			return enseignant;
		}

		public void setEnseignant(Enseignant enseignant) {
			this.enseignant = enseignant;
		}

		public Niveau getNiveau() {
			return niveau;
		}

		public void setNiveau(Niveau niveau) {
			this.niveau = niveau;
		}


}
