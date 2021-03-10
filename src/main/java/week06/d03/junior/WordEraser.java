package week06.d03.junior;

public class WordEraser {

    /*
    A WordEraser osztályban legyen egy eraseWord(String words, String word)
     metódus, mely az első paraméter szöveget úgy változtatja meg,
      hogy a második paraméter összes előforulását kitörli belőle. A words paraméterben a szavak szóközzel vannak elválasztva.
       A metódus térjen vissza a törölni kívánt szavak nélküli Stringgel. (Mellőzzük a replace és replaceAll használatát!)
     */

    public String eraseWord(String words, String word) {
        String[] parts = words.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            if (!part.equals(word)) {
                sb.append(part);
            }
        }
        return sb.toString();
    }
}
