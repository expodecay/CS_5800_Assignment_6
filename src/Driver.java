public class Driver {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.idle();
        vendingMachine.selectSnack("s1");
        vendingMachine.insertMoney(5.00);
        vendingMachine.dispenseSnack();

        vendingMachine.idle();
        vendingMachine.selectSnack("s3");
        vendingMachine.insertMoney(5.00);
        vendingMachine.dispenseSnack();

        vendingMachine.idle();
        vendingMachine.selectSnack("s6");
        vendingMachine.insertMoney(5.00);
        vendingMachine.dispenseSnack();

        vendingMachine.idle();
        vendingMachine.selectSnack("s6");
        vendingMachine.insertMoney(5.00);
        vendingMachine.dispenseSnack();
    }
}
