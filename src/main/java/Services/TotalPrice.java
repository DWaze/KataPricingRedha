package Services;

import Models.Product;

import java.math.BigDecimal;
import java.util.Map;

public class TotalPrice implements PriceCalculator {

    @Override
    public TotalPrice calcPrice(Map<String, Product> listOfProduct) {
        double totalPrice=0;
        listOfProduct.forEach(
                (productKey, productValue) -> {
                    productValue.getPricingModel().calculateProductsPrice(productValue);
                }
        );
    }
}
