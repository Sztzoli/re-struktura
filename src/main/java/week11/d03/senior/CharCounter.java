package week11.d03.senior;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CharCounter {

    public int countChars(String[] chars) {
        Set<Character> result = new HashSet<>();
        for (char c : chars[0].toCharArray()) {
            result.add(c);
        }
        for (String text : chars) {
            Set<Character> temp = new HashSet<>();
            for (char c : text.toCharArray()) {
                temp.add(c);
            }
            result.retainAll(temp);
        }
        return result.size();
    }

//    Készítsünk egy CharCounter osztályt, melyben van egy int countChars(String[] chars) metódus.
//    A feladat az, hogy összeszámoljuk azokat a karaktereket asz összes chars-ban lévő String-ből, amelyek mindegyik String-ben szerepelnek.
//    Példa: Ha a chars-ban ["abc", "cba", "ab"] szerepel, akkor a
//    visszatérési érték 2, mert az a és a b karakter szerepel mindegyik String-ben.
}
