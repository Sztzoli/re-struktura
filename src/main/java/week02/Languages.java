package week02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Languages {
    private static boolean biggerThanFiveCharacter(String l) {
        return l.length() > 5;
    }
    /*
    Hozz létre egy Languages osztályt, main metódussal!
     Ebben hozz létre egy listát, mely karakterláncokat tartalmaz! Vegyetek fel 3 elemet: Java, Python, JavaScript!

    Írd ki, az öt karakternél hosszabb programozási nyelveket!

     */

    public List<String> filterByLength(List<String> languages) {
        return languages.stream()
                .filter(Languages::biggerThanFiveCharacter)
                .collect(Collectors.toList());
    }

    public List<String> filterByLengthNormal(List<String> languages) {
        List<String> result = new ArrayList<>();
        for (String language : languages) {
            if(language.length()>5) {
                result.add(language);
            }
        }
        return result;
    }



    public static void main(String[] args) {
        List<String> languages = List.of("Java", "Python", "JavaScript");
        Languages languages1 = new Languages();
        System.out.println(languages1.filterByLength(languages));
    }
}
