public class Domino {
    private int number,number2;

    public Domino(int number, int number2) {
        this.number = number;
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return number + " " + number2;
    }

    public void reverse(){
        int temp = this.number;
        this.number = number2;
        this.number2 = temp;
    }

    public int getNumber() {
        return number;
    }

    public int getNumber2() {
        return number2;
    }
}
