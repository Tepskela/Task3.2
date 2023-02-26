public class BmiService {
    public int calculate(int mass, int height) {
        int imb = mass / height * height;
        return imb;
    }
}
