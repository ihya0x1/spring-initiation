package IoCXMLannotation;

import org.springframework.stereotype.Component;

@Component(value = "BeanProfInfo")
public class ProfInfo implements Prof {

	@Override
	public String GetSpecialite() {

		return "Informatique";
	}

}
