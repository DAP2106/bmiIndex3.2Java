public class Main {
    public static void main(String[] args) {
        BmiService servise = new BmiService();

        double weight = 98;
        double height = 1.87;
        double bmiIndex = servise.calculate(weight, height);

        System.out.println("Индекс массы тела :" + bmiIndex);


    }
}
