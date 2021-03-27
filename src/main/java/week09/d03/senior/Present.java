package week09.d03.senior;

import java.util.Random;

public enum Present {
    TOY, ELECTRONICS, HOUSEKEEPING, DECORATION;


    public static Present gift(Person person) {
        Random rnd = new Random();
        int index;
        if (person.getAge() > 14) {
            index = rnd.nextInt(Present.values().length - 1) + 1;
        } else {
            index = rnd.nextInt(Present.values().length);
        }
        return Present.values()[index];
    }
}
