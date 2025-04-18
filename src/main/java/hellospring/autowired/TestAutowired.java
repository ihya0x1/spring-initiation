package hellospring.autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAutowired {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AutreSpringBean autreSpringBean = (AutreSpringBean)context.getBean("autowiredBeanHelloWorld");
		autreSpringBean.autowiredHelloworld.getMessage();
}
}
