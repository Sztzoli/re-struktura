package erettsegi.o2005.table;

import java.io.*;
import java.nio.channels.IllegalSelectorException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Locale;
import java.util.Properties;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class VigenereTable {

    Scanner scanner = new Scanner(System.in);
    private String text;
    private String keyWord;
    private final String[][] codeTable;

    public VigenereTable() {
        this.codeTable = readFromFile();
    }

    private String[][] readFromFile() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(VigenereTable.class.getResourceAsStream("Vtabla.dat")))) {
            String line;
            String[][] result = new String[26][26];
            int count = 0;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("");
                System.arraycopy(parts, 0, result[count], 0, parts.length);
                count++;
            }
            return result;
        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot read", ioe);
        }
    }

    public String getText() {
        return text;
    }

    public String getKeyWord() {
        return keyWord;
    }


    public <T> T getData(String message, Supplier<T> supplier, Predicate<T> predicate) {
        T data = getData(message, supplier);
        if (predicate.test(data)) {
            return data;
        }
        throw new IllegalStateException("A szövegnek 255 karakternél többnek kell lennie");
    }

    public <T> T getData(String message, Supplier<T> supplier) {
        System.out.println(message);
        return supplier.get();
    }

    public void initText() {
        String data = getData("adj meg a szöveget", () -> scanner.nextLine(), p -> !p.isBlank());
        this.text = convertToCode(data);
    }

    public void initKeyWord() {
        String data = getData("adja meg a kulcsszót", () -> scanner.nextLine());
        String word = convertToCode(data);
        StringBuilder sb = new StringBuilder();
        sb.append(word.repeat(text.length() / word.length()));
        sb.append(word.substring(0, text.length() % word.length()));
        this.keyWord = sb.toString();
    }

    public String coding() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            String actual = codeTable[(int)text.charAt(i)-65][(int)keyWord.charAt(i)-65];
            sb.append(actual);
        }
        String result = sb.toString();
        Path path = Path.of("src/main/resources/erettsegi/o2005/table/Kodolt.dat");
        try {
            Files.writeString(path,result);
        } catch (IOException ioException) {
            throw new IllegalStateException("cannot write", ioException);
        }
        return result;
    }

    public String convertToCode(String text) {
        text = text.toLowerCase();
        Properties properties = getProperties("replace.properties");
        for (String key : properties.stringPropertyNames()) {
            text = text.replaceAll(key, properties.getProperty(key));
        }
        return text.toUpperCase();
    }

    private Properties getProperties(String propertiesName) {
        Properties properties = new Properties();
        try (InputStream input = getClass().getResourceAsStream(propertiesName)) {
            properties.load(input);
        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot load properties", ioException);
        }
        return properties;
    }

    public static void main(String[] args) {
        VigenereTable table = new VigenereTable();
        table.initText();
        table.initKeyWord();
        System.out.println(table.coding());



    }
}
