public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        double mass = 74;
        double growth = 1.72;
        double bmi = service.calculate(mass,growth);
        System.out.println("Индекс массы тела равен:" + bmi);
    }
}