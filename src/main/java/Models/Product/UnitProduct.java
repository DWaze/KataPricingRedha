package Models.Product;

import Models.PricingModels.PricingModel;
import Models.PricingModels.UnitBased.UnitPricingModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UnitProduct extends Product {
    private BigDecimal unitPrice;
    private double prodQuantity;
    private UnitPricingModel pricingModel;

    @Override
    public BigDecimal getProductsPrice() {
        return pricingModel.calculateProductsPrice(this);
    }
}
