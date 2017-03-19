package domain;

public class Discount {

    public double hasDiscount(double accumulation, double productPrice){
        double sum = accumulation + productPrice;
        double percent = 0;
        if (sum >= 10000) {
            percent = 0.15;
        }
        return percent;
    }
}
