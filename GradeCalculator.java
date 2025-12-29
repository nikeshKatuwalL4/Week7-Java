package Workshop7;

public class GradeCalculator {
    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return (double) sum / grades.length;
    }
}
