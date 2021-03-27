package week08.d04.junior;

public class Trainer {

    private CanMark canMark;

    public Trainer(CanMark canMark) {
        this.canMark = canMark;
    }

    public int giveMark() {
        return canMark.giveMark();
    }

    public static void main(String[] args) {
        Trainer good = new Trainer(new GoodMood());
        System.out.println(good.giveMark());

        Trainer bad = new Trainer(new BadMood());
        System.out.println(bad.giveMark());
    }
}
