package Models.Cart;

import Models.PricingModels.UnitBased.BundlePricing;
import Models.PricingModels.UnitBased.PercentPricing;
import Models.PricingModels.UnitBased.SimplePricing;
import Models.PricingModels.WeightBased.WeightPricing;
import Models.PricingModels.WeightBased.WeightPricingModel;
import Models.PricingModels.WeightBased.WeightUnit;
import Models.Product.UnitProduct;
import Models.Product.WeightProduct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @BeforeEach
    void setUp() {
        WeightProduct apple = new WeightProduct();
        apple.setProductId("P1");
        apple.setProdDescription("Apple from spain, good quality");
        apple.setProdName("Apple");
        apple.setWeightPrice(new BigDecimal("1.99"));
        apple.setWeightQuantity(1);
        apple.setPricingModel(new WeightPricing(2,new BigDecimal(3), WeightUnit.KG));

        UnitProduct tomato = new UnitProduct();
        tomato.setProductId("P2");
        tomato.setProdDescription("Tomato can from Italy");
        tomato.setProdName("Tomato can");
        tomato.setUnitPrice(new BigDecimal("0.75"));
        tomato.setPricingModel(new SimplePricing());

        UnitProduct tomato2 = new UnitProduct();
        tomato.setProductId("P2");
        tomato.setProdDescription("Tomato can from Japan");
        tomato.setProdName("Tomato can");
        tomato.setUnitPrice(new BigDecimal("1.75"));
        tomato.setPricingModel(new PercentPricing(0.2,10));

        WeightProduct salmon = new WeightProduct();
        salmon.setProductId("P3");
        salmon.setProdDescription("Salmon from France");
        salmon.setProdName("Salmon");
        salmon.setWeightPrice(new BigDecimal("16.5"));
        salmon.setWeightQuantity(1);
        salmon.setPricingModel(new WeightPricing(2,new BigDecimal(25), WeightUnit.KG));
    }

    @Test
    void addToCart() {
    }

    @Test
    void testAddToCart() {
    }

    @Test
    void removeByWhole() {
    }

    @Test
    void removeByUnit() {
    }

    @Test
    void emptyCart() {
    }
}