package Models.PricingModels.WeightBased;

import Models.Product.WeightProduct;

import java.math.BigDecimal;


public class WeightPricing extends WeightPricingModel {

    private final double weight;
    private final BigDecimal weightPrice;
    private final WeightUnit weightUnit;

    public WeightPricing(double weight, BigDecimal weightPrice, WeightUnit weightUnit) {
        this.weight = weight;
        this.weightPrice = weightPrice;
        this.weightUnit = weightUnit;
    }

    @Override
    public BigDecimal calculateProductsPrice(Object product) {
        castedWeightProduct = (WeightProduct) product;
        return (weightPrice
                .multiply(BigDecimal.valueOf(castedWeightProduct.getWeightQuantity())))
                .divide(BigDecimal.valueOf(weight),2,1);
    }
}
