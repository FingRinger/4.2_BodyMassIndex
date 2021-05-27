public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassindex = service.calculate(56,1.68);
        System.out.println(bodyMassindex);

    }
}
