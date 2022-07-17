import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 52.50;
        System.out.println("Вес: " + weight + " кг");

        double height = 1.55;
        System.out.println("Рост: " + height + " см");

        double bmi = service.calculate(weight, height);

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Индекс массы тела: " + df.format(bmi));

    }
}
