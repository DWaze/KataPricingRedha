package Models.PricingModels;

import Models.Product;

import java.math.BigDecimal;

public class SimplePricing implements PricingModel {
    @Override
    public double calculateProductsPrice(Product product) {
        return product.getUnitPrice() * product.getProdQuantity();
    }
}
