package erettsegi.m2005.lotto;

import java.util.Scanner;
import java.util.function.Supplier;

public class DataFormUser {

    Scanner scanner = new Scanner(System.in);


    public <T> T getData(Supplier<T> supplier, String text) {
        System.out.println(text);
        return supplier.get();
    }
}
