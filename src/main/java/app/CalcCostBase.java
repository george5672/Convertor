package app;

public class CalcCostBase {

    public double CalcCostBase(Product product) {

        return product.getQuota() * product.getPrice();
    }
}

