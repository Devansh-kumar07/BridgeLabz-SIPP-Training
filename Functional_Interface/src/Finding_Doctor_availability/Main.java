package Finding_Doctor_availability;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
//import java.util.Comparator;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Doctors> list = Arrays.asList(
				new Doctors("abhay singh", "Neuro", "available"),
				new Doctors("dev", "ortho", "not available"),
				new Doctors("lakshay ", "aand", "available")
				);
		
		List<Doctors> doc = list.stream()
				.filter(f -> f.getCurrentStat().equals("available"))
				.collect(Collectors.toList());
		
		//print
		doc.forEach(System.out::println);
		

	}

}
