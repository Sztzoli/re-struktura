package week11.d03.junior;

import java.util.List;
import java.util.stream.Collectors;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c) {
        return words.stream().filter(x -> x.contains(String.valueOf(c))).collect(Collectors.toList());
    }

//    Készíts egy WordFilter osztályt, melyben van egy List<String> wordsWithChar(List<String> words, char c) metódus.
//    A metódus kiválógatja a paraméterül kapott String listából azokat a szavakat, melyekben előfordul a
//    c karakter, majd ezeket visszaadja egy listában.
}
