package ru.gb.oop.dz_task_1;

class Buyer {
    String userName;
    Basket basket;

    protected Buyer(String userName, Basket basket) {
        this.userName = userName;
        this.basket = basket;
    }

    protected Buyer() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
