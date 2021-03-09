package week03;

public class Operation {
    /*
    Írj egy Operation osztályt, mely konstruktorban kap egy összeadást,
    pl. 68+12! A getResult() metódus visszaadja a művelet eredményét. Egy belső leftOperand és rightOperand attribútumba dolgozz!

     */
    private int leftOperand;
    private int rightOperand;

    public Operation(String operation) {
        int indexOfPlus = operation.indexOf("+");
        this.leftOperand = Integer.parseInt(operation.substring(0,indexOfPlus));
        this.rightOperand = Integer.parseInt(operation.substring(indexOfPlus+1));
    }

    public int getResult() {
        return leftOperand+rightOperand;
    }

    public static void main(String[] args) {
        Operation operation = new Operation("24+25");
        System.out.println(operation.getResult());
    }
}
