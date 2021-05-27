public class BmiService {
    public double calculate (double weight, double height){
        weight = 56;
        height = 1.68;
        double bodyMassIndex = weight / (height * height);

        return bodyMassIndex;
    }
}
