package Kata.PricingModels.UnitBased;

import Kata.Product.UnitProduct;

import java.math.BigDecimal;

public class SimplePricing extends UnitPricingModel {

    @Override
    public BigDecimal calculateProductsPrice(Object product) {
        castedProduct = (UnitProduct) product;
        return castedProduct.getUnitPrice().multiply(BigDecimal.valueOf(castedProduct.getProdQuantity()));
    }
}
