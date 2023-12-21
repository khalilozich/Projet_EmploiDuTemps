package emploi.project.com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Horaire {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String debut;
	    private String fin;

	    // Many-to-One association avec Jour
	    @ManyToOne
	    @JoinColumn(name = "jour_id")
	    private Jour jour;

		public Horaire(Long id, String debut, String fin, Jour jour) {
			super();
			this.id = id;
			this.debut = debut;
			this.fin = fin;
			this.jour = jour;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDebut() {
			return debut;
		}

		public void setDebut(String debut) {
			this.debut = debut;
		}

		public String getFin() {
			return fin;
		}

		public void setFin(String fin) {
			this.fin = fin;
		}

		public Jour getJour() {
			return jour;
		}

		public void setJour(Jour jour) {
			this.jour = jour;
		}


}
