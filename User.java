package ru.gb.oop.dz_task_1;

class User extends Buyer {
    protected String login;
    private String password;


    public User(String userName, String login, String password, Basket basket) {
        super(userName, basket);
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    protected void setLogin(String login) {
        this.login = login;
    }

    protected void setPassword(String password) {
        this.password = password;
    }
}
