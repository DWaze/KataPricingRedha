package Services;

import Models.Product.Product;

import java.math.BigDecimal;
import java.util.Map;
import java.util.function.Function;

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
