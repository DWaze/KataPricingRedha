package Services;

import Models.Product.Product;

import java.math.BigDecimal;
import java.util.Map;

public interface PriceCalculator {

    BigDecimal calculatePrice(Map<String, Product> listOfProduct);
}
