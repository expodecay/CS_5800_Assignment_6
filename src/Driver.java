public class Driver {
    public static void main(String[] args) {

        /*ATMMachine atmMachine = new ATMMachine();
        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(2000);
        atmMachine.insertCard();
        atmMachine.insertPin(1234);*/

        SnackDispenseHandler snack1 = new SodaDispenser();
        SnackDispenseHandler snack2 = new SodaDispenser();
        SnackDispenseHandler snack3 = new ChipDispenser();
        SnackDispenseHandler snack4 = new ChipDispenser();
        SnackDispenseHandler snack5 = new ChochlateDispenser();
        SnackDispenseHandler snack6 = new ChochlateDispenser();

        snack1.setNextChain(snack2);
        snack2.setNextChain(snack3);
        snack3.setNextChain(snack4);
        snack4.setNextChain(snack5);
        snack5.setNextChain(snack6);

        Snack request = new Snack("pepsi");

        snack1.calculate(request);
    }
}
