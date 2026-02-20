package day1;

public class ques3 {
	public static void main(String[] args) {
		
		 int cost = 129;
	        int sell = 191;
	        int profit = sell - cost;
	        double percent = (profit * 100.0) / cost;

	        System.out.println(
	            "Cost: ₹" + cost +
	            "\nSell: ₹" + sell +
	            "\nProfit: ₹" + profit +
	            "\nProfit %: " + percent + "%"
	        );

		

	}

}
