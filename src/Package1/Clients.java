package Package1;

import Enums.Gender;

public class Clients {
    private String name;
    private int age;
    private Gender gender;
    private  String email;
    private String password;

    public Clients(String name, int age, Gender gender, String email, String password) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "\nClients{" +
                "\nname='" + name + '\'' +
                "\nage=" + age +
                "\ngender=" + gender +
                "\nemail='" + email + '\'' +
                "\npassword='" + password + '\'' +
                '}';
    }
}
