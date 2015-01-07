package ramesh.rest;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("person", new Person());
		return "index";
	}

	@RequestMapping(value = "request", method = RequestMethod.POST)
	public String requestBody(@RequestBody String body,
			@RequestParam String nam, @RequestParam String var2, Model model) {
		System.out.println("Incoming message: " + nam + ", " + var2
				+ ", Body: " + body);
		// System.out.println(bod);
		return "redirect:/";
	}

	@RequestMapping(value = "validation", method = RequestMethod.POST)
	public String validationBody(@Valid Person person, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Error occured !!!!!");
			return "index";
		}
		System.out.println("Incoming Person: " + person.getName());
		// System.out.println(bod);
		return "redirect:/";
	}
}
