package Kata;

import Kata.Product.Product;

import java.math.BigDecimal;
import java.util.Map;

public class SimplePriceCalculator implements PriceCalculator {

    @Override
    public BigDecimal calculatePrice(Map<String, Product> listOfProduct) {
//        return (BigDecimal) listOfProduct.values().stream().map(
//                Product::getCurrentProductsPrice
//        ).reduce(BigDecimal::add);
        BigDecimal total = new BigDecimal(0);
        for (Map.Entry<String, Product> entry : listOfProduct.entrySet()) {
            total = total.add(entry.getValue().getProductsPrice());
        }
        return total;
    }


}
