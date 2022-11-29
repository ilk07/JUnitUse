package Homeworks_2_1;

public class User {
    protected String login;
    protected String email;
    protected String pass;
    protected int age;

    public User(String login, String email,String pass, int age){
        this.login = login;
        this.pass = pass;
        this.email = email;
        this.age = age;
    }
    public String getLogin() {
        return login;
    }
    public String getPass() {
        return pass;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.login + ", " + this.email + ", " + this.age;
    }
}
