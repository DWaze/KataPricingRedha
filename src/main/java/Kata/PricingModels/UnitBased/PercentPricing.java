package Kata.PricingModels.UnitBased;

import Kata.Product.UnitProduct;

import java.math.BigDecimal;

public class PercentPricing extends UnitPricingModel {

    double bonusAmount;
    int bonusQuantity;

    public PercentPricing(double bonusAmount, int bonusQuantity) {
        this.bonusAmount = bonusAmount;
        this.bonusQuantity = bonusQuantity;
    }

    @Override
    public BigDecimal calculateProductsPrice(Object product) {
        castedProduct = (UnitProduct) product;
        if (castedProduct.getProdQuantity() > bonusQuantity) {
            return castedProduct.getUnitPrice()
                    .multiply(BigDecimal.valueOf(castedProduct.getProdQuantity()))
                    .multiply(BigDecimal.valueOf(bonusAmount));
        }
        return castedProduct.getUnitPrice()
                .multiply(BigDecimal.valueOf(castedProduct.getProdQuantity()));
    }
}
