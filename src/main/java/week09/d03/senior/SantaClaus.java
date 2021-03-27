package week09.d03.senior;

import java.util.List;

public class SantaClaus {

    private List<Person> people;

    public SantaClaus(List<Person> people) {
        this.people = people;
    }

    public void getThroughChimneys() {
        people.forEach(Person::setPresent);
    }
}
