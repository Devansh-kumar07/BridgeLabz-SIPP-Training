package movie_rating;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
import java.util.Comparator;
public class TrendingMovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Movies> list = Arrays.asList(
				new Movies("simbha",9.05),
				new Movies("avengers", 7),
				new Movies("narsimha", 9.9),
				new Movies("don",8.5),
				new Movies("avengers 2", 7.09),
				new Movies("ne-zham", 9.99)
				);
		//System.out.println(list);
	    // Filtering by rating > 8.0 and sorting in descending order
        List<Movies> finlist = list.stream()
                .filter(f -> f.getMovRating() > 8.0) // keep only movies with rating > 8
                .sorted(Comparator.comparing(Movies::getMovRating).reversed()) // sort high → low
                .collect(Collectors.toList());

        // Print result
        finlist.forEach(System.out::println);
    }
}


