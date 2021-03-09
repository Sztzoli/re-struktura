package week04;

public class NameChanger {
    /*
    Készítsd el a NameChanger osztályt, melynek privát attribútuma legyen a String fillName,
     mely egy ember teljes nevét reprezentálja!
      A fullName attribútum [vezetéknév][szóköz][keresztnév] formátumban épül fel.
      A konstruktor állítsa be a paraméterül kapott értékre az adattagot, de ha az érték null, vagy üres String,
       akkor dobjon egy IllegalAgrumentException kivételt a következő üzenettel: Invalid name:[paraméter értéke]!

Legyen egy changeFirstName(String firstName) metódusa, mely megváltoztatja az objektum állapotát és kicseréli a vezetéknevet a paraméterül kapott értékre!
     */

    private String fullName;

    public NameChanger(String fullName) {
        checkFullName(fullName);
        this.fullName = fullName;
    }

    private void checkFullName(String fullName) {
        if (fullName==null || fullName.isBlank()){
            throw new IllegalArgumentException("Invalid name: " + fullName);
        }
    }

    public String getFullName() {
        return fullName;
    }


    public void changeFirstName(String newFirstName) {
        String firstName = fullName.substring(0,fullName.indexOf(" "));
        this.fullName = fullName.replace(firstName, newFirstName);
    }

    @Override
    public String toString() {
        return "NameChanger{" +
                "fullName='" + fullName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        NameChanger nameChanger = new NameChanger("Smith Joe");
        nameChanger.changeFirstName("Doe");
        System.out.println(nameChanger);
    }
}
