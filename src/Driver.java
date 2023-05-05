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

        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultNumbers();
        Chain chainCalc4 = new DivNumbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request = new Numbers(4, 2, "mult");

        chainCalc1.calculate(request);
    }
}
