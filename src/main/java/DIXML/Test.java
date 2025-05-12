package DIXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("DIXML/Beans.xml");
		Prof P1 = context.getBean("BeanProfInfo", Prof.class);
		String specialite = P1.GetSpecialite();
		String dep = P1.GetDeptProf();
		System.out.println("profInfo :");
		System.out.println("specialite :" +specialite);
		System.out.println("dep :"+dep);

		Prof P2 = context.getBean("BeanProfStat", Prof.class);
		String specialite2 = P2.GetSpecialite();
		String dep2 = P2.GetDeptProf();
		System.out.println("profStat :");
		System.out.println("specialite :"+specialite2);
		System.out.println("dep :"+ dep2);
		context.close();
	}

}
