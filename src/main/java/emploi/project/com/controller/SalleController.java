package emploi.project.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import emploi.project.com.models.Salle;
import emploi.project.com.service.SalleService;

@RestController
@RequestMapping("/salle")
public class SalleController {
	
		
		@Autowired
		private SalleService salleService;
		
		@PostMapping
		public void ajouter(@RequestBody Salle S) {
			salleService.ajouter(S);
		}
		
		@GetMapping
		public List<Salle> get(){
			return salleService.getDevs();
		}

		@GetMapping("/{id}")
		public List<Devloppeur> get(@PathVariable int id){
			return devService.getDev(id);
		}
		
		@GetMapping("/projet/{idProjet}")
		public List<Devloppeur> getDevs(@PathVariable int idProjet){
			return devService.getDev(idProjet);
		}
		

	}


}
