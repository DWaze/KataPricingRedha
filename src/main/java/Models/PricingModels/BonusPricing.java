package Models.PricingModels;

import Models.Product;

import java.math.BigDecimal;

public class BonusPricing implements PricingModel {

    double bonusAmount;

    public BonusPricing(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    @Override
    public double calculateProductsPrice(Product product) {
        return product.getUnitPrice() * product.getProdQuantity() / bonusAmount;
    }
}
