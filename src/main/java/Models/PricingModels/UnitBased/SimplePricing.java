package Models.PricingModels.UnitBased;

import Models.PricingModels.PricingModel;
import Models.Product.Product;
import Models.Product.UnitProduct;

import java.math.BigDecimal;

public class SimplePricing extends UnitPricingModel {

    @Override
    public BigDecimal calculateProductsPrice(Object product) {
        castedProduct = (UnitProduct) product;
        return castedProduct.getUnitPrice().multiply(BigDecimal.valueOf(castedProduct.getProdQuantity()));
    }
}
