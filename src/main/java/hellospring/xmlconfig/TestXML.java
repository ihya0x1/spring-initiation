package hellospring.xmlconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestXML {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hellospring/xmlconfig/Beans.xml");
		HelloWorld xmlhelloworld = (HelloWorld) context.getBean("BeanHelloWorld");
		xmlhelloworld.getMessage();
		context.close() ;
		}
}