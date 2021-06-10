package Models.Cart;

import Models.Product.Product;
import Models.Product.UnitProduct;
import Models.Product.WeightProduct;

import java.util.Map;

public interface CartInt {

    Map<String, Product> addToCart(WeightProduct product);

    Map<String, Product> addToCart(UnitProduct product);

    Map<String, Product> removeByWhole(String productId);

    Map<String, Product> removeByUnit(String productId, int toRemoveQuantity);

    Map<String, Product> emptyCart();
}
