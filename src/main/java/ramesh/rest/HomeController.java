package ramesh.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping( method=RequestMethod.GET)
	public String home(){
		return "index";
	}
	@RequestMapping(value="request",method=RequestMethod.POST)
	public String requestBody(@RequestBody String body, @RequestParam String nam, @RequestParam String var2, Model model){
		System.out.println("Incoming message: "+nam+", "+var2+", Body: "+body);
		//System.out.println(bod);
		return "redirect:/";
	}
}
