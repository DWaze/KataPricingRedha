package Models.Product;

import Models.PricingModels.PricingModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Product {
    String productId;
    String prodName;
    String prodDescription;

    public abstract BigDecimal getProductsPrice();
}
