package Models;

import Services.TotalPrice;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final Map<String, Product> listOfProducts;
    private final TotalPrice totalPrice;

    public Cart() {
        this.listOfProducts = new HashMap<String, Product>();
        totalPrice = new TotalPrice();
    }


    public void addProduct(Product product) {
        if (this.listOfProducts.containsKey(product.getProductId()) && product.getProdQuantity() > 0) {
            Product toUpdateProduct = (Product) this.listOfProducts.get(product.getProductId());
            toUpdateProduct.setProdQuantity(toUpdateProduct.getProdQuantity() + product.getProdQuantity());
            this.listOfProducts.put(toUpdateProduct.getProductId(), toUpdateProduct);
        } else {
            this.listOfProducts.put(product.getProductId(), product);
        }
        totalPrice.calcPrice(listOfProducts);
    }

    public void removeProduct(String productId, int toRemoveQuantity) {
        if (this.listOfProducts.containsKey(productId)) {
            Product toUpdateProduct = this.listOfProducts.get(productId);
            toUpdateProduct.setProdQuantity(
                    ((toUpdateProduct.getProdQuantity() > toRemoveQuantity)
                            ? toUpdateProduct.getProdQuantity() - toRemoveQuantity :
                            0));
            totalPrice.calcPrice(listOfProducts);
        }
    }

    public TotalPrice getTotalPrice(){
        return totalPrice;
    }
}
