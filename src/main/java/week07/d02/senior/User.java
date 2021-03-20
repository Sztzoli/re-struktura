package week07.d02.senior;

public interface User {

    static User of(String userName, String fistName, String lastName) {
        return new UserImpl(userName, fistName, lastName);
    }

    String getUsername();

    String getFirstName();

    String getLastName();

    default String getFullName() {
        return getFirstName() + " " + getLastName();
    }
}
