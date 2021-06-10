package Kata.PricingModels;

import java.math.BigDecimal;

public interface PricingModel {

    BigDecimal calculateProductsPrice(Object product);
}
