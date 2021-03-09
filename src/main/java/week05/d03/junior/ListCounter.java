package week05.d03.junior;

import java.util.List;

public class ListCounter {

    /*
    Írj egy olyan metódust a ListCounter osztályban, mely a kapott String listából összeszámolja azokat,
    amelyek a vagy A betűvel kezdődnek! Ha nulla elemű a tömb, vagy nincs benne ilyen elem, akkor nulla értéket adjon vissza!
     */

    public int countByStarterCharacter(List<String> stringList) {
        return (int) stringList.stream()
                .map(String::toLowerCase)
                .filter(str -> str.startsWith("a"))
                .count();
    }
}
