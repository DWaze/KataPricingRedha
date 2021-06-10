package Models.PricingModels.UnitBased;

import Models.PricingModels.PricingModel;
import Models.Product.Product;
import Models.Product.UnitProduct;

import java.math.BigDecimal;

public class BundlePricing extends UnitPricingModel {

    private final double bundleSize;
    private final BigDecimal bundlePrice;

    public BundlePricing(double bundleSize, BigDecimal bundlePrice) {
        this.bundleSize = bundleSize;
        this.bundlePrice = bundlePrice;
    }

    @Override
    public BigDecimal calculateProductsPrice(Object product) {
        castedProduct = (UnitProduct) product;
        double numOfBundles = castedProduct.getProdQuantity() / bundleSize;
        double remainingProd = castedProduct.getProdQuantity() % bundleSize;
        return new BigDecimal(numOfBundles)
                .multiply(bundlePrice)
                .add(castedProduct.getUnitPrice()
                        .multiply(new BigDecimal(remainingProd)));
    }
}
