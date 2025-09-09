package movie_rating;

public class Movies {
	
	private String movName;
	private double movRating;
	
	public Movies(String movName,double movRating) {
		this.movName=movName;
		this.movRating=movRating;	
	}

	@Override
	public String toString() {
		return " [movName=" + movName + ", movRating=" + movRating + "]";
	}

	public String getMovName() {
		return movName;
	}

//	public void setMovName(String movName) {
//		this.movName = movName;
//	}

	public double getMovRating() {
		return movRating;
	}

//	public void setMovRating(float movRating) {
//		this.movRating = movRating;
//	}
	
	

}
