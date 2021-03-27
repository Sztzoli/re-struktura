package week09.d03.senior;

public class Person {
    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Present getPresent() {
        return present;
    }

    public void setPresent() {
        this.present =  Present.gift(this);
    }
}
