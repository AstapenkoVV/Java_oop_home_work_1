package ru.gb.oop.dz_task_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Basket extends Buyer {
    protected ArrayList<Product> productsList;

    public Basket() {
        this.productsList = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        if (product.getQuantity() > 0 && product.getQuantity() >= quantity) {
            this.productsList.add(product);
            product.setQuantity(product.getQuantity() - quantity);
            product.setCount(quantity);
        } else {
            System.out.println("Товар: " + product.getName() +
                    " в колличестве: " + quantity +
                    " шт. - нет в наличии!" +
                    " В наличии: " + product.getQuantity() + " шт.");
        }
    }

    public void removeProduct(Product product, int quantity) {
        this.productsList.add(product);
        product.setQuantity(product.getQuantity() + quantity);
        product.setCount(product.getCount() - quantity);
    }

    public Map<String, Integer> getTotalQuantity() {
        Map<String, Integer> productCount = new HashMap<>();
        for (Product products : this.productsList) {
            String productName = products.getName();
            Integer productQuantity = products.getCount();
            productCount.put(productName, productQuantity);
        }
        return productCount;
    }

    public Map<String, Double> getTotalPrice() {
        Map<String, Double> productTotalPrice = new HashMap<>();
        for (Product products : this.productsList) {
            String productName = products.getName();
            double productPrice = products.getPrice() * products.getCount();
            productTotalPrice.put(productName, productPrice);
        }
        return productTotalPrice;
    }
}
