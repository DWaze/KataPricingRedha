package Services;

import Models.Product;

import java.math.BigDecimal;
import java.util.Map;

public class TotalPrice implements PriceCalculator {

    @Override
    public double calcPrice(Map<String, Product> listOfProduct) {
        double totalPrice=0;
        listOfProduct.forEach(
                (productKey, productValue) -> {
                    productValue.getPricingModel().calculateProductsPrice(productValue);
                }
        );

        for (Map.Entry<String, Product> entry : listOfProduct.entrySet()) {
            totalPrice += entry.getValue().getCurrentProductsPrice();
        }

        return totalPrice;
    }
}
