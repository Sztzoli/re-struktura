package week11.d04.junior;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesSum {


    public boolean isRegularFile(Path path) {
        return Files.exists(path);
    }

    public int sumNumbers() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            String file = "number0"+i+".txt";
            Path path = Path.of(file);
            if (isRegularFile(path)){
                sum += readFromFile(path);
            }
        }
        return sum;
    }

    private int readFromFile(Path path) {
        try {
            return Integer.parseInt(Files.readString(path));
        } catch (IOException ioException) {
            throw new IllegalStateException("File cannot read", ioException);
        }
    }




//    Adott az aktuális könyvtárban több, fájl, melynek a nevei:
//    number00.txt, number03.txt, number20.txt, egészen 99-ig.
//    Nem minden fájl létezik, lehet, hogy bizonyos számhoz tartozó fájl kimaradt.
//    Olvasd be az állományból a benne lévő számot, és ezt összegezd! Használd a Files.isRegularFile()
//    metódust arra, hogy megnézd, létezik-e a fájl! Használd a Files.readString() metódust a fájl beolvasására!
//    A FilesSum osztály int sumNumbers() metódusába dolgozz!
//
//try {
//        String content = Files.readString(Path.of("helloworld.txt"));
//        System.out.println(content);
//    } catch (IOException e) {
//        throw new IllegalStateException("Can not read", e);
//    }
//
//    System.out.println(Files.isRegularFile(Path.of("kutya.txt")));
//    System.out.println(Files.isRegularFile(Path.of("helloworld.txt")));
}
