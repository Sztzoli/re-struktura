package week06.d01.junior;

import java.util.List;

public class ListSelector {

    /*
    Írj egy olyan metódust az ListSelector osztályban, mely egy kapott listából minden második elemet kiválogat,
    és egy szövegként összerak, szögletes zárójelek között.
     A páros megállapítása index szerint működik. Azaz az első, nulla indexű elem páros, a második, azaz egyes indexű elem páratlan, stb.
    Ha üres a lista, akkor üres stringet adjunk vissza. Ha a paraméterül kapott lista null, akkor dobj IllegalArgumentExceptiont a metódusban!
     */

    public String selectEverySecondElement(List<String> list) {
        if (list==null) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            if (i%2==0) {
                sb.append(list.get(i));
                sb.append(" ,");
            }
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append("]");
        return sb.toString();
    }


    public static void main(String[] args) {
        ListSelector selector = new ListSelector();
        System.out.println(selector.selectEverySecondElement(List.of(
                "aaaaaaa",
                "bbbbbbbbb",
                "cccccccccc",
                "dddddddddddd",
                "eeeeeeeeee"
        )));
    }
}
