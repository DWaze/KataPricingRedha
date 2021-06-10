package Kata.Cart;

import Kata.Product.Product;
import Kata.Product.UnitProduct;
import Kata.Product.WeightProduct;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class Cart implements CartInt {
    private final Map<String, Product> listOfProducts;

    public Cart() {
        this.listOfProducts = new HashMap<>();
    }

    @Override
    public Map<String, Product> addToCart(UnitProduct product) {
        if (this.listOfProducts.containsKey(product.getProductId())) {
            UnitProduct toUpdateProduct = (UnitProduct) this.listOfProducts.get(product.getProductId());
            toUpdateProduct.setProdQuantity(toUpdateProduct.getProdQuantity() + product.getProdQuantity());
            this.listOfProducts.put(toUpdateProduct.getProductId(), toUpdateProduct);
        } else {
            if (product.getProdQuantity() > 0) {
                this.listOfProducts.put(product.getProductId(), product);
            }
        }
        return listOfProducts;
    }

    @Override
    public Map<String, Product> addToCart(WeightProduct product) {
        if (this.listOfProducts.containsKey(product.getProductId())) {
            WeightProduct toUpdateProduct = (WeightProduct) this.listOfProducts.get(product.getProductId());
            if (product.getWeightQuantity() > 0) {
                toUpdateProduct.setWeightQuantity(toUpdateProduct.getWeightQuantity()+product.getWeightQuantity());
                this.listOfProducts.put(product.getProductId(), product);
            }
        }else{
            if (product.getWeightQuantity() > 0) {
                this.listOfProducts.put(product.getProductId(), product);
            }
        }
        return listOfProducts;
    }

    @Override
    public Map<String, Product> removeByWhole(String productId) {
        this.listOfProducts.remove(productId);
        return this.listOfProducts;
    }

    @Override
    public Map<String, Product> removeByUnit(String productId, int toRemoveQuantity) {
        if (this.listOfProducts.containsKey(productId)) {
            UnitProduct toUpdateProduct = (UnitProduct) this.listOfProducts.get(productId);
            if (toRemoveQuantity >= toUpdateProduct.getProdQuantity()) {
                this.listOfProducts.remove(productId);
            } else {
                toUpdateProduct.setProdQuantity(
                        ((toUpdateProduct.getProdQuantity() > toRemoveQuantity)
                                ? toUpdateProduct.getProdQuantity() - toRemoveQuantity :
                                0));
            }
        }
        return listOfProducts;
    }

    @Override
    public Map<String, Product> emptyCart() {
        listOfProducts.clear();
        return listOfProducts;
    }
}
