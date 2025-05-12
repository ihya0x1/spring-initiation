package DIXMLannotation;

import org.springframework.stereotype.Component;

@Component(value = "BeanDepartementINSEA")

public class DepartementINSEA implements Departement {

	@Override
	public String GetDepartment() {
		// TODO Auto-generated method stub
		return "INSEA";
	}

}
