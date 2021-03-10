package week06.d03.senior;

public enum SeriesType {
    INC,
    DESC,
    NONE;


    public static SeriesType typeOf(int a, int b){
        if (a-b<0) {
            return INC;
        } else {
            return DESC;
        }
    }
}
