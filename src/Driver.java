public class Driver {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.idle();
        vendingMachine.selectSnack("s1");
        vendingMachine.insertMoney(5.25);
        vendingMachine.dispenseSnack();

        vendingMachine.idle();
        vendingMachine.selectSnack("s3");
        vendingMachine.insertMoney(5.25);
        vendingMachine.dispenseSnack();

        vendingMachine.idle();

    }
}
