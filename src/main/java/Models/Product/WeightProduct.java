package Models.Product;

import Models.PricingModels.WeightBased.WeightPricingModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WeightProduct extends Product{
    private BigDecimal weightPrice;
    private double weightQuantity;
    private WeightPricingModel pricingModel;

    @Override
    public BigDecimal getProductsPrice() {
        return pricingModel.calculateProductsPrice(this);
    }
}
