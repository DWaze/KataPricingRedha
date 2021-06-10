package Models.PricingModels;

import Models.Product.Product;

import java.math.BigDecimal;

public interface PricingModel {

    BigDecimal calculateProductsPrice(Object product);
}
