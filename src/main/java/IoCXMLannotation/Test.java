package IoCXMLannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Prof P1 = context.getBean("BeanProfInfo", Prof.class);
		String specialite = P1.GetSpecialite();
		System.out.println(specialite);
		Prof P2 = context.getBean("BeanProfStat", Prof.class);
		String specialite2 = P2.GetSpecialite();
		System.out.println(specialite2);

	}

}
