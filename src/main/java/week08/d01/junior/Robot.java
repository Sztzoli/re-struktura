package week08.d01.junior;

public class Robot {

    public String move(String text) {
        int up = count(text, 'F');
        int down = count(text, 'L');
        int right = count(text, 'J');
        int left = count(text, 'B');
        int vertical = up - down;
        int horizontal = right - left;
        StringBuilder sb = new StringBuilder();
        if (vertical > 0) {
            sb.append("F".repeat(vertical));
        } else {
            sb.append("L".repeat(Math.abs(vertical)));
        }
        if (horizontal > 0) {
            sb.append("J".repeat(horizontal));
        } else {
            sb.append("B".repeat(Math.abs(horizontal)));
        }

        return sb.toString();
    }

    private int count(String text, char c) {
        if (c != 'F' && c != 'L' && c != 'J' && c != 'B') {
            throw new IllegalArgumentException();
        }
        return (int) text.chars()
                .filter(x -> x == (int) c)
                .count();
    }
}
