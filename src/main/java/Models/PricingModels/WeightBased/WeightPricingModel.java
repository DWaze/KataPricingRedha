package Models.PricingModels.WeightBased;

import Models.PricingModels.PricingModel;
import Models.Product.UnitProduct;
import Models.Product.WeightProduct;

public abstract class WeightPricingModel implements PricingModel {
    protected WeightProduct castedWeightProduct;
}
