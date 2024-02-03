package ru.gb.oop.dz_task_1;

class Product{
    public String name;
    public String category;
    public Integer quantity;
    public Integer price;
    public Integer rating;
    public Integer count;

    public Product(String name, String category, Integer quantity, Integer price, Integer rating) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Товар: " + name +
                ", категория товара: " + category +
                ", колличество товара в магазине: " + quantity +
                ", цена: " + price +
                ", рейтинг: " + rating;
    }
}
