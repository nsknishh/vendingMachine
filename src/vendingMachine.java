public class vendingMachine {
    private int snackCount;
    private int minCapacity;
    public vendingMachine(int initialSnacks, int minimum) {
        double snackCount = initialSnacks;
        double minCapacity = minimum;
    }
    public boolean buySnack(int snackCount, int minCapacity) {
        if (this.snackCount > 0) {
            this.snackCount--;
        }
        return this.snackCount < this.minCapacity;
    }

    public static void main(String[] args) {

    }
}