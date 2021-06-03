package Services;

import Models.Product;

import java.util.Map;

public interface PriceCalculator {

    public TotalPrice calcPrice(Map<String, Product> listOfProduct);
}
