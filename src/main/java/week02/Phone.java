package week02;

public class Phone {
    /*
    Írj egy Phone osztályt, type (String) és mem (int) attribútumokkal! Generálj konstruktort,
    gettert és settert! Írj bele egy main metódust, amivel példányosítasz egy osztályt,
    és kiírod az attribútumok értékeit!
     */

    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "type='" + type + '\'' +
                ", mem=" + mem +
                '}';
    }

    public static void main(String[] args) {
        Phone phone = new Phone("Samsung",16);
        System.out.println(phone.getMem());
        System.out.println(phone.getType());
    }
}
