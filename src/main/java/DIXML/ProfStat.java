package DIXML;

public class ProfStat implements Prof {
	
	private Departement DepProf;
	public ProfStat() {}
	public ProfStat(Departement DepProf) {
		this.DepProf = DepProf;
	}


	public void setDepProf(Departement depProf) {
		DepProf = depProf;
	}
	@Override
	public String GetSpecialite() {
		// TODO Auto-generated method stub
		return "Statistique";
	}

	@Override
	public String GetDeptProf() {
		// TODO Auto-generated method stub
		return DepProf.GetDepartment();
	}

}
