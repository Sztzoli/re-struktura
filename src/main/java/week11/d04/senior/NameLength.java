package week11.d04.senior;

import java.util.List;
import java.util.stream.Collectors;

public class NameLength {


    List<Integer> getLengths(List<String> names) {
        return names.stream().
                filter(x -> x.toLowerCase().startsWith("j"))
                .map(String::length)
                .distinct()
                .collect(Collectors.toList());
    }


//    Adott egy nevek listája. Add vissza egy listában, hogy milyen hosszúságú J karakterrel kezdődő nevek szerepelnek a listában!
//    Minden szám csak egyszer szerepeljen! A NameLength osztály getLengths(List<String>)
//    metódusába dolgozz! Ha a bemenet pl. List.of("Joe", "Jack", "Jane", "Jake", "George", "William"), a visszatérési érték [3, 4] legyen!
}
