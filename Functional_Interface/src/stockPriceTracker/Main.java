package stockPriceTracker;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // Simulated live stock price feed
        List<Double> stockPrices = Arrays.asList(101.5, 102.8, 100.9, 105.2, 103.7);

        System.out.println("📈 Live Stock Price Updates:");
        
        // Use forEach() to print updates
        stockPrices.stream()
                   .forEach(price -> System.out.println("Stock Price: $" + price));
    }
}
