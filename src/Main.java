public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 98;
        int height = (int) 1.98;
        int imb = service.calculate(mass, height);
        System.out.println(imb);
    }
}