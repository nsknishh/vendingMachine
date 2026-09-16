public class vendingMachine {
    private int snackCount;
    private int minCapacity;
    public vendingMachine(int initialSnacks, int minimum) {
        this.snackCount = initialSnacks;
        this.minCapacity = minimum;
    }
    public boolean buySnack() {
        if (this.snackCount > 0) {
            this.snackCount--;
        }
        return this.snackCount < this.minCapacity;
    }

    public static void main(String[] args) {

        vendingMachine vendingMachine = new vendingMachine(5, 3);

        System.out.println("----------Starting the Vending Machine---------");

        System.out.println("Bought snack 1. Restock Needed?" + vendingMachine.buySnack());
        System.out.println("Bought snack 2. Restock Needed?" + vendingMachine.buySnack());
        System.out.println("Bought snack 3. Restock Needed?" + vendingMachine.buySnack());
        System.out.println("Bought snack 4. Restock Needed?" + vendingMachine.buySnack());
    }
}
