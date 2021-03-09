package week05.d05.junior;

public class User {

    /*
    Készíts egy osztályt User néven, melynek van egy firstName (String),
    egy lastName (String) és egy email (String) mezője! Legyen ellenőrzés a User konstruktorában,
    mely hibát jelez, ha nincs @ és . (pont) az e-mail cimben!
     Készíts egy metódust is getFullName() névvel, mely visszaadja a firstName és a lastName változókat összefűzve.
      Legyen közöttük egy whitespace (" ").
     */


    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        cheackEamil(email);
        this.email = email;
    }

    private void cheackEamil(String email) {
        if (email.indexOf('@')<0 || email.indexOf('.')<0) {
            throw new IllegalArgumentException();
        }
    }

    public String getFullName() {
        return firstName+" "+lastName;
    }
}
