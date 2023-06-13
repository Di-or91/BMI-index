public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 75;
        double height = 1.7;
        double bmiIndex = service.calculate(weight, height);

        System.out.println("Ваш индекс массы тела:" + bmiIndex);
    }
}
