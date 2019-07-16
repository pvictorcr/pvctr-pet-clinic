package pvctr.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

	@RequestMapping({"/vets", "/vets/inex", "/vets/index.html"})
	public String listVets() {
		
		return "vets/index";
	}
}
