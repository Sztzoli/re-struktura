package week05.d02;

public class ChangeLetter {
    public static final String AEIOU = "[aeiou]";



    /*
    A ChangeLetter osztályban írj meg egy String changeVowels(String) metódust,
     mely kicseréli a paraméterként átadott szövegben az angol magánhangzókat csillag (*) karakterre.

     */

    public String changeVowels(String word) {
        return word.replaceAll(AEIOU,"*");
    }


    public static void main(String[] args) {
        ChangeLetter changeLetter = new ChangeLetter();
        System.out.println(changeLetter.changeVowels("acebáoi"));
    }
}
