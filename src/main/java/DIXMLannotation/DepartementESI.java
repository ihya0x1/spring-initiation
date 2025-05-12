package DIXMLannotation;

import org.springframework.stereotype.Component;

@Component(value = "BeanDepartementESI")

public class DepartementESI implements Departement {

	@Override
	public String GetDepartment() {
		// TODO Auto-generated method stub
		return "ESI";
	}

}
