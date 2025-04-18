package hellospring.javaconfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "javaBeanHelloWorld")
public class HelloWorld {
	@Value("Hello World from javaconfig")
	private String message;
	public void setMessage(String message) {
		this.message = message;
		}
	public void getMessage() {
		System.out.println("Your Message : " + this.message);
		}
}