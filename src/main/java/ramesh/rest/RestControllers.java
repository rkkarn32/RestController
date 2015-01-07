package ramesh.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestControllers {
	@RequestMapping(value="/rest",method=RequestMethod.GET,produces="application/json")
	public List<Person> getPerson(){
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Ramesh", 27));
		list.add(new Person("Deepesh",29));
		return list;
	}
	
	@RequestMapping(value="/restxml",method=RequestMethod.GET,produces="application/xml")
	public List<Person> getPersonXml(){
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Ramesh", 27));
		list.add(new Person("Deepesh",29));
		return list;
	}
}
