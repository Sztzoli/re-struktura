package week03;

import java.util.List;
import java.util.stream.Collectors;

public class Position {
    public static final int BONUS_LINE = 150_000;
    /*
    Írj egy Position osztályt, melynek van egy name és egy bonus attribútuma!
    Egy alkalmazotti pozíciót jelöl, melynek a bonus attribútuma tárolja,
    hogy ebben a pozícióban évente mennyi bónuszt kap egy alkalmazott. A main metódusban hozz létre egy Position objektumokat tartalmazo listát!

Menj végig a lista elemein, és írd ki azokat, ahol a bónusz magasabb, mint 150_000. Azonban a kiírás
formátumát a Position osztály toString() metódusában implementáld!
     */

    private final String name;
    private final int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    private static boolean bonusBiggerThenBonusLine(Position x) {
        return x.bonus > BONUS_LINE;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", bonus='" + bonus + '\'' +
                '}';
    }

    static List<Position> filterByBonus(List<Position> positions) {
        return positions.stream()
                .filter(Position::bonusBiggerThenBonusLine)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Position> positions = List.of(
                new Position("Director",300_000),
                new Position("Worker",200_000),
                new Position("Worker2",140_000),
                new Position("Worker3",100_000),
                new Position("Worker4",350_000)
        );
        System.out.println(filterByBonus(positions));
    }
}
