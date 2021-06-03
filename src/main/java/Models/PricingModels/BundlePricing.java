package Models.PricingModels;

import Models.Product;

public class BundlePricing implements PricingModel {

    private final double bundleSize;
    private final double bundlePrice;

    public BundlePricing(double bundleSize, double bundlePrice) {
        this.bundleSize = bundleSize;
        this.bundlePrice = bundlePrice;
    }

    @Override
    public double calculateProductsPrice(Product product) {
        double numOfBundles = product.getProdQuantity() / bundleSize;
        double remainingProd = product.getProdQuantity() % bundleSize;
        return numOfBundles * bundlePrice + remainingProd * product.getUnitPrice();
    }
}
