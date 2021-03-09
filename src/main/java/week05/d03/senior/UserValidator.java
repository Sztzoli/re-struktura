package week05.d03.senior;

import java.util.List;

public class UserValidator {

    /*
    A UserValidator osztályba írj egy validate(List<User>) metódust, mely leellenőrzi a paraméterben átadott felhasználókat!
    (A User egy String name és egy int age attribútumot tartalmazzon!) Ha a lista null, dobjon kivételt! Ha a felhasználó null,
     dobjon kivételt! Ha A felhasználó neve null, vagy üres, dobjon kivételt! Ha az életkor kisebb, mint 0, vagy nagyobb, mint 120, dobjon kivételt!
     */

    public void validate(List<User> users) {
        if (users == null || users.size() == 0) {
            throw new IllegalArgumentException();
        }
        for (User user: users) {
            user.validate();
        }
    }
}
