package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Vehicle;
import dmacc.repository.CarRepository;

@Controller
public class WebController {

	@Autowired
	CarRepository repo;

	// Car viewAll
	@GetMapping({ "/", "viewAll" })

	public String viewAllCars(Model model) {

		if (repo.findAll().isEmpty()) {

			return addNewCar(model);

		}

		model.addAttribute("cars", repo.findAll());

		return "results";

	}
	
	// Car input
	@GetMapping("/inputCar")

	public String addNewCar(Model model) {

		Vehicle c = new Vehicle();

		model.addAttribute("newCar", c);

		return "input";

	}
	
	// Car edit
	@GetMapping("/edit/{id}")

	public String showUpdateCar(@PathVariable("id") long id, Model model) {

		Vehicle c = repo.findById(id).orElse(null);

		System.out.println("ITEM TO EDIT: " + c.toString());

		model.addAttribute("newCar", c);

		return "input";

	}
	
	// Car update
	@PostMapping("/update/{id}")

	public String reviseCar(Vehicle c, Model model) {

		repo.save(c);

		return viewAllCars(model);

	}
	
	// Car delete
	@GetMapping("/delete/{id}")

	public String deleteCar(@PathVariable("id") long id, Model model) {

		Vehicle c = repo.findById(id).orElse(null);

		repo.delete(c);

		return viewAllCars(model);

	}

}
