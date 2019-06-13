package ch.swisscom.Timetracking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TimetrackingControler {
	@Autowired
	private Trakerlist trakerlist; 
	//display the trakerlist
	@GetMapping("/timetraker")
	public String listtraker(Model model) {
		System.out.println(trakerlist.getAllTraker());
		model.addAttribute("listOfTraker", trakerlist.getAllTraker());
		model.addAttribute("newtraker", new Traker(0, null, null, null));
		return "timetraker";
	}
	//go to newtraker
	@GetMapping("/newtraker")
	public String newTraker() {
		return "newtraker";
	}
	
	//for adding new trakers
	@RequestMapping(value = "/add", method=RequestMethod.POST)
	public String addTraker(@RequestBody Traker newtraker, Model model ) {
		trakerlist.addTraker(newtraker);
		model.addAttribute("listOfTraker", trakerlist.getAllTraker());
		return "timetraker"; 
	}
	
	
	//for deleting the selected traker
	@RequestMapping(value = "/delete-traker", method=RequestMethod.POST)
	public String deleteTraker(Model model) {
		if ((trakerlist.getAllTraker()) != null && (trakerlist.getAllTraker().size() > 0)) {
			trakerlist.removeTraker(0);
		}		
		return "timetraker";
	}
	
	//to clone a traker
	@PostMapping("/clone")
	public String clone(Model model) throws CloneNotSupportedException {
		if ((trakerlist.getAllTraker()) != null && (trakerlist.getAllTraker().size() > 0)) {
			
		}
		
		return "redirect:/timetraker";
	}
	@PostMapping("/start")
	public String starttimer(Model model) {
		
		
		return "redirect:/timetraker";
	}
	//go to edittraker
	@GetMapping("/edittraker")
	public String editTraker() {
		return "edittraker";
	}
	
	//for adding editing trakers
	@RequestMapping(value = "/edit", method=RequestMethod.POST)
	public String edittraker( Model model ) {
		
		
		return "timetraker"; 
	}
	
	
}