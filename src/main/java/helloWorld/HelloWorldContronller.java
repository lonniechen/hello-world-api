package helloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContronller {
	
	@RequestMapping("/helloWorld")
	String helloWorld() {
		return "Hello World!";
	}

}
