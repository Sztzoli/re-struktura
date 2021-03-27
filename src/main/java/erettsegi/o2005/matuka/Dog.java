package erettsegi.o2005.matuka;

public class Dog {
    private long id;
    private String breed;
    private String sex;
    private String age;
    private String name;

    public Dog(long id, String breed, String sex, String age, String name) {
        this.id = id;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getBreed() {
        return breed;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toStringByBreed() {
        return String.format("name:%s;breed:%s;age:%s",name,breed,age);
    }
}
