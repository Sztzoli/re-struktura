package week06.d03.senior;

import java.util.List;

public class Series {

    /*
    A Series osztályban hozz létre egy calculateSeriesType() metódust,
     mely egész számok listáját kapja, és eldönti, hogy növekvő, csökkenő vagy össze-vissza sorozatról van-e szó! Feltétel,
     hogy a bemeneti lista nem tartalmaz egymás után egyenlő értékeket.
      Ha a lista üres, vagy csak egy elemből áll, dobj kivételt! Mivel térnél vissza?
     */

    public SeriesType calculateSeriesType(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty() || numbers.size()==1) {
            throw new IllegalArgumentException();
        }
        SeriesType type = SeriesType.typeOf(numbers.get(0), numbers.get(1));
        boolean isSameType = true;
        int index = 1;
        while (isSameType && index < numbers.size()-1) {
            SeriesType actualType = SeriesType.typeOf(numbers.get(index), numbers.get(index+1));
            if (actualType != type) {
                isSameType = false;
            }
            index++;
        }
        if (!isSameType) {
            type = SeriesType.NONE;
        }
        return type;
    }
}
