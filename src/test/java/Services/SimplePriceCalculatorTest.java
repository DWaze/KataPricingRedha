package Services;

import Kata.Cart.Cart;
import Kata.PricingModels.UnitBased.PercentPricing;
import Kata.PricingModels.UnitBased.SimplePricing;
import Kata.PricingModels.WeightBased.WeightPricing;
import Kata.PricingModels.WeightBased.WeightUnit;
import Kata.Product.UnitProduct;
import Kata.Product.WeightProduct;
import Kata.SimplePriceCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SimplePriceCalculatorTest {

    Cart cart;

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
        tomato.setProdQuantity(1);
        tomato.setUnitPrice(new BigDecimal("0.75"));
        tomato.setPricingModel(new SimplePricing());

        UnitProduct tomato2 = new UnitProduct();
        tomato2.setProductId("P3");
        tomato2.setProdDescription("Tomato can from Japan");
        tomato2.setProdQuantity(1);
        tomato2.setProdName("Tomato can");
        tomato2.setUnitPrice(new BigDecimal("1.75"));
        tomato2.setPricingModel(new PercentPricing(0.2,10));

        WeightProduct salmon = new WeightProduct();
        salmon.setProductId("P4");
        salmon.setProdDescription("Salmon from France");
        salmon.setProdName("Salmon");
        salmon.setWeightPrice(new BigDecimal("16.5"));
        salmon.setWeightQuantity(1);
        salmon.setPricingModel(new WeightPricing(2,new BigDecimal(25), WeightUnit.KG));

        cart = new Cart();
        cart.addToCart(apple);
        cart.addToCart(tomato);
        cart.addToCart(tomato2);
        cart.addToCart(salmon);
    }

    @Test
    void calculatePrice() {
        SimplePriceCalculator simplePriceCalculator = new SimplePriceCalculator();
        BigDecimal totalPrice = simplePriceCalculator.calculatePrice(cart.getListOfProducts());
        assertThat(simplePriceCalculator.calculatePrice(cart.getListOfProducts())).isEqualTo(20.99);
    }
}