public class BmiService {
    public double calculate(double weight, double height) {
        double bmiIndex = weight / (height * height);
        return (int) bmiIndex;
    }

}
