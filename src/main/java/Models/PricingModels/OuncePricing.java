package Models.PricingModels;

import Models.Product;

import java.math.BigDecimal;

public class OuncePricing implements PricingModel {

    double ounceToPoundFactor = 0.0625;

    @Override
    public double calculateProductsPrice(Product product) {
        return (product.getProdQuantity() * ounceToPoundFactor)*product.getUnitPrice();
    }
}
