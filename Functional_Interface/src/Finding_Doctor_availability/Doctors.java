package Finding_Doctor_availability;

public class Doctors {
	
	private String name;
	private String speciality;
	private String currentStat;
	
	public Doctors(String name, String speciality, String currentStat) {
		
		this.name = name;
		this.speciality = speciality;
		this.currentStat = currentStat;
	}
	@Override
	public String toString() {
		return "Doctors [name=" + name + ", speciality=" + speciality + ", currentStat=" + currentStat + "]";
	}
//	public String getName() {
//		return name;
//	}
//	public String getSpeciality() {
//		return speciality;
//	}

	public String getCurrentStat() {
		return currentStat;
	}

	
	
	
	

}
