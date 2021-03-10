package week06.d05.senior;

public enum BottleType {
    GLASS_BOTTLE(15),
    PET_BOTTLE(25);

    private int maxLevel;

    BottleType(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }
}
