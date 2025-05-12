package DIXML;

public class ProfInfo implements Prof {
	
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