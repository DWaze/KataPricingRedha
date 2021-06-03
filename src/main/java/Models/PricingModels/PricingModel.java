package Models.PricingModels;

import Models.Product;

import java.math.BigDecimal;

public interface PricingModel {

    public double calculateProductsPrice(Product product);
}
