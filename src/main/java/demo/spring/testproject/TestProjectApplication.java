package demo.spring.testproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}

}
@RestController
class TestController{
	@Value("${spring.application.name}")
	String appName;
	@GetMapping("/")
	public String greet(){
		return "<h1>Welcome To The "+appName+"</h1>";
	}
}