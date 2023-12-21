package emploi.project.com.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class EmploiDuTemps {

   	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    // One-to-Many association avec Jour
	    @OneToMany(mappedBy = "emploiDuTemps")
	    private List<Jour> jours;

		public EmploiDuTemps(Long id, List<Jour> jours) {
			super();
			this.id = id;
			this.jours = jours;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public List<Jour> getJours() {
			return jours;
		}

		public void setJours(List<Jour> jours) {
			this.jours = jours;
		}
	    
}
