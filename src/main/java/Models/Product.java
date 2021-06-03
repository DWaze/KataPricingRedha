package Models;

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
public class Product {
    private String productId;
    private String prodName;
    private String prodDescription;
    private double unitPrice;
    private double prodQuantity;
    private double currentProductsPrice;
    private PricingModel pricingModel;
    private double weightQuantity;
    private int ounceQuantity;
}
