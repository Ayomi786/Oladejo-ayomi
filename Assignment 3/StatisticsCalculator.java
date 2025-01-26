import java.util.Arrays;

public class StatisticsCalculator {
    public static void main(String[] args) {
        // Sample data array
        double[] data = {12, 15, 14, 10, 18, 20, 22, 25, 30};

        // Calculate mean
        double mean = calculateMean(data);
        System.out.println("Mean: " + mean);

        // Calculate median
        double median = calculateMedian(data);
        System.out.println("Median: " + median);

        // Calculate standard deviation
        double standardDeviation = calculateStandardDeviation(data, mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }

    // Method to calculate mean
    public static double calculateMean(double[] data) {
        double sum = 0;
        for (double num : data) {
            sum += num;
        }
        return sum / data.length;
    }

    // Method to calculate median
    public static double calculateMedian(double[] data) {
        Arrays.sort(data); // Sort the array
        int n = data.length;
        if (n % 2 == 0) {
            // If even, average the two middle numbers
            return (data[n / 2 - 1] + data[n / 2]) / 2.0;
        } else {
            // If odd, return the middle number
            return data[n / 2];
        }
    }

    // Method to calculate standard deviation
    public static double calculateStandardDeviation(double[] data, double mean) {
        double sumSquaredDifferences = 0;
        for (double num : data) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / data.length);
    }
}