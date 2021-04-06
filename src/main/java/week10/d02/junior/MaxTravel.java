package week10.d02.junior;

import java.util.*;

public class MaxTravel {

    public int getMaxIndexMap(List<Integer> numbers) {
        Map<Integer, Integer> stats = new HashMap<>();
        for (int number: numbers) {
            stats.merge(number,1, Integer::sum);
        }
        return Collections.max(stats.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
    public int getMaxIndex(List<Integer> numbers) {
        int actualNumber = numbers.get(0);
        int maxNumber = numbers.get(0);
        int counter = 0;
        int maxCounter = 0;
        for (int i = 0; i <numbers.size() ; i++) {
            if (numbers.get(i) == actualNumber) {
                counter++;
                if (i == numbers.size()-1 && maxCounter<counter) {
                    maxCounter = counter;
                    maxNumber = actualNumber;
                }
            }
            else {
                if (maxCounter<counter) {
                    maxCounter = counter;
                    maxNumber = actualNumber;
                }
                actualNumber = numbers.get(i);
                counter=1;
            }
        }
        return maxNumber;
    }



//    Van egy egész számok listája, amelyben egy szám azt jelzi, hogy az adott számú buszmegállóban egy ember fel akar szállni.
//    A 12,12,0,3,4,4 sorozat tehát azt jelenti, hogy a 12-es buszmegállóban 2-en, a 0-ásban 1 ember, 3-asban egy ember,
//    4-esben 2 ember akar felszállni. A MaxTravel osztály getMaxIndex() metódusa adja vissza, hogy hanyas megállóban szeretnének
//    a legtöbben felszálln! Maximum 30 megálló lehet.
//
//Leegyszerűsítve a feladat az, hogy a paraméterként átadott tömbben keresse meg, hogy melyik szám szerepel a legtöbbször.
}
