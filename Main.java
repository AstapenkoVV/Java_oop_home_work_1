package ru.gb.oop.dz_task_1;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 * 2) Создать класс Категория, имеющий переменные имя и массив товаров.
 * Создать несколько объектов класса Категория.
 * 3) Создать класс Basket, содержащий массив купленных товаров.
 * 4) Создать класс User, содержащий логин, пароль и объект класса Basket.
 * Создать несколько объектов класса User.
 * 5) Вывести на консоль каталог продуктов. (все продукты магазина)
 * 6) Вывести на консоль покупки посетителей магазина.
 * (После покупки у пользователя добавляется товар, а из магазина - удаляется)
 */

public class Main {
    public static void main(String[] args) {

        Set<Product> products = new HashSet<>();

        Product product1 = new Product("Индейка", "Мясо", 10, 400, 5);
        Product product2 = new Product("Сметана", "Молочка", 10, 150, 3);
        Product product3 = new Product("Помидоры", "Овощи", 10, 250, 4);
        Product product4 = new Product("Огурцы", "Овощи", 10, 250, 4);
        Product product5 = new Product("Молоко", "Молочка", 10, 150, 5);
        Product product6 = new Product("Говядина", "Мясо", 10, 600, 5);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);

        getAllProducts(products);
        System.out.println();

        Basket basket1 = new Basket();
        Basket basket2 = new Basket();
        Basket basket3 = new Basket();

        User user1 = new User("Иван", "ivan", "pass1", basket1);
        User user2 = new User("Павл", "pavel", "pass2", basket2);
        User user3 = new User("Антон", "anton", "pass2", basket3);

        user1.getBasket().addProduct(product1, 5);
        user1.getBasket().removeProduct(product1, 1);

        user2.getBasket().addProduct(product6, 2);
        user2.getBasket().addProduct(product2, 1);
        user2.getBasket().addProduct(product3, 4);

        user2.getBasket().addProduct(product5, 5);
        user2.getBasket().removeProduct(product5,1);

        user3.getBasket().addProduct(product1, 4);
        user3.getBasket().addProduct(product3, 2);

        System.out.println();
        System.out.println("Покупки покупателей:");
        printUserBascet(user1);
        System.out.println();

        printUserBascet(user2);
        System.out.println();

        printUserBascet(user3);
        System.out.println();

        getAllProducts(products);
        System.out.println();
    }

    private static void getAllProducts(Set<Product> products) {
        for (Product product : products)
            System.out.println(product);
    }

    private static void printUserBascet(User user) {
        System.out.println("Пользователь: " + user.getUserName());
        Map<String, Double> productTotalPrice = user.getBasket().getTotalPrice();
        Map<String, Integer> getTotalQuantity = user.getBasket().getTotalQuantity();
        for (String product : productTotalPrice.keySet()) {
            System.out.println(
                    "  Товар: " + product +
                            ", Цена: " + ((productTotalPrice.get(product)) / getTotalQuantity.get(product))  +
                            ", Количество: " + getTotalQuantity.get(product) +
                            ", Итог: " + productTotalPrice.get(product));
        }
    }
}
