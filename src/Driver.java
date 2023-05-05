public class Driver {
    public static void main(String[] args) {

        ATMMachine atmMachine = new ATMMachine();
        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(2000);
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        System.out.println();

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.idle();

        SnackDispenseHandler snack1 = new SodaDispenser();
        SnackDispenseHandler snack2 = new ChipDispenser();
        SnackDispenseHandler snack3 = new ChochlateDispenser();

        snack1.setNextChain(snack2);
        snack2.setNextChain(snack3);

        Snack request = new Snack("kitkat");

        snack1.calculate(request);
    }
}
