package DIXMLannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "BeanProfInfo")
public class ProfInfo implements Prof {
	@Autowired
	@Qualifier("BeanDepartementINSEA")
	private Departement DepProf;
	public ProfInfo() {}
	public ProfInfo(Departement DepProf) {
		this.DepProf = DepProf;
	}
	

	public void setDepProf(Departement depProf) {
		DepProf = depProf;
	}
	@Override
	public String GetSpecialite() {

		return "Informatique";
	}
	@Override
	public String GetDeptProf() {
		return DepProf.GetDepartment();
	}

}
