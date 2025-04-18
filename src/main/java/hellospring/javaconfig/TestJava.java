package hellospring.javaconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TestJava {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld helloworld = (HelloWorld) context.getBean("javaBeanHelloWorld");
		helloworld.getMessage();
}
}
