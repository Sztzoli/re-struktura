package week06.d05.senior;

public class Bottle {
    /*
    Készíts egy Bottle nevű osztályt, amelynek van 2 attribútuma: BottleType type és int filledUntil.
    A BottleType legyen felsorolásos típus az alábbi értékekkel: GLASS_BOTTLE és PET_BOTTLE!
    A Bottle nevű osztálynak legyen egy static metódusa of néven, mely paraméterként egy BottleType-ot vár
     és visszaad egy új Bottle objektumot amelyet a megadott paraméter alapján hoz létre. A Bottle osztálynak legyen
     egy fill metódusa, mely egy int fillAmount paramétert vár. A fill meghívása esetén végezzen ellenőrzést, hogy megtelt-e már
      a Bottle objektum. Az ehhez szükséges int maximumAmount mezőt a BottleType tartalmazza! Ha túlcsordulna a Bottle objektum, akkor dobj kivételt!
         */

    private BottleType type;
    private int filledUntil;

    private Bottle(BottleType type) {
        this.type = type;
    }

    public static Bottle of(BottleType type) {
        return new Bottle(type);
    }

    void fill(int fillAmount) {
        if (filledUntil + fillAmount <= type.getMaxLevel()) {
            filledUntil += fillAmount;
        } else {
            throw new IllegalStateException();
        }
    }
}
