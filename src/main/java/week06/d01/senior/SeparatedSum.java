package week06.d01.senior;

public class SeparatedSum {

    /*
    Írj egy SeparatedSum.sum(String s) metódust, mely kap egy String-et, melyben lebegőpontos számok szerepelnek pontosvesszővel elválasztva.
     A számoknál vessző a tizedeselválasztó.
     Ezt szétszedi, és összeadja külön a pozitív és külön a negatív számokat. Mivel térnél vissza ebből a metódusból?
     */

    public Result sum(String text) {
        Result result = new Result();
        String[] parts = text.split(";");
        for (String word: parts) {
            result.addString(word);
        }
        return result;
    }
}
