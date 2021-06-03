package Services;

import Models.Product;

import java.util.Map;

public interface PriceCalculator {

    public double calcPrice(Map<String, Product> listOfProduct);
}
