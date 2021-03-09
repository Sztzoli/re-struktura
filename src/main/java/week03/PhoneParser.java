package week03;

public class PhoneParser {

    public static final String SEPARATOR = "-";

    public Phone parse(String phoneNumber) {
        int indexOfSeparator = phoneNumber.indexOf(SEPARATOR);
        return new Phone(
                phoneNumber.substring(0,indexOfSeparator),
                phoneNumber.substring(indexOfSeparator+1)
        );
    }

    public static void main(String[] args) {
        PhoneParser parser = new PhoneParser();
        Phone phone = parser.parse("10-1234567");
        System.out.println(phone);
    }
}
