package week05.d03.senior;

import java.util.List;

public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void validate() {
        if (this.name == null || this.name.isBlank()) {
            throw new IllegalArgumentException();
        }
        if (this.age < 0 || this.age > 120) {
            throw new IllegalArgumentException();
        }
    }
}
