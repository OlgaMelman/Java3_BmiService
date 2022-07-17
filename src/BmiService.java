public class BmiService {

    public double calculate(double kilogram, double meters) {

        double bmi;
        bmi = kilogram / (meters * meters);

        return bmi;
    }


}
