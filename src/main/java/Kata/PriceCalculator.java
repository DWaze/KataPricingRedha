package Kata;

import Kata.Product.Product;

import java.math.BigDecimal;
import java.util.Map;

public interface PriceCalculator {

    BigDecimal calculatePrice(Map<String, Product> listOfProduct);
}
