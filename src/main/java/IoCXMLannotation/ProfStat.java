package IoCXMLannotation;

import org.springframework.stereotype.Component;

@Component(value = "BeanProfStat")
public class ProfStat implements Prof {

	@Override
	public String GetSpecialite() {
		return "Statistique";
	}

}
