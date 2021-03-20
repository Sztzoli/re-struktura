package week07.d05.senior;

import java.io.IOException;
import java.nio.channels.IllegalSelectorException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.function.Supplier;

public class SaveInput {

    Scanner scanner = new Scanner(System.in);

    private String getData(Supplier<String> supplier, String message) {
        System.out.println(message);
        return supplier.get();
    }

    private void writeFile() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 3; i++) {
            sb.append(getData(() -> scanner.nextLine(), "adja meg az " + i + ".sort"));
            sb.append("\n");
        }
        String fileName = getData(() -> scanner.nextLine(), "Adja meg a fájl nevét");
        Path path = Path.of("src/main/resources/week07/d05/senior/" + fileName);
        try {
            Files.writeString(path, sb.toString());
        } catch (IOException ioException) {
            throw new IllegalStateException("File cannot write", ioException);
        }
    }

    public static void main(String[] args) {
        SaveInput saveInput = new SaveInput();
        saveInput.writeFile();
    }
}
