package week08.d01.senior;

import java.util.Arrays;
import java.util.List;

public class Sultan {

    public static boolean[] doors = new boolean[100];

    public String openDoors() {
        for (int i = 0; i < doors.length; i++) {
            for (int j = 0; j < doors.length; j++) {
                if ((j+1)%(i+1)==0) {
                    doors[j] = !doors[j];
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < doors.length; i++) {
            if (doors[i]) {
                sb.append(i+1).append(";");
            }
        }
        return sb.toString();
    }

}
