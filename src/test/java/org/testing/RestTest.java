package org.testing;

import java.util.List;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import ramesh.rest.Person;


public class RestTest {
	@Test
	public void test(){
		RestTemplate restTemplate=new RestTemplate();
		//Person model=restTemplate.getForObject("http://localhost:8080/SringMVCSetup/testrest", PersonModel.class);
		List<Person> model=restTemplate.getForObject("http://localhost:8080/RestExample/restxml", List.class);
	}
}
