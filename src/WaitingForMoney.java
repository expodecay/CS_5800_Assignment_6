public class WaitingForMoney implements StateOfVendingMachine{

    VendingMachine vendingMachine;

    public WaitingForMoney(VendingMachine newVendingMachine){
        vendingMachine = newVendingMachine;
    }

    @Override
    public void idle() {
        System.out.println("Transaction Canceled");
    }

    @Override
    public void selectSnack(String snack_location) {
        System.out.println("nah dawg, pay for THIS transaction first.");
    }

    @Override
    public void insertMoney(Double amount) {
        System.out.println("$" + amount + " Inserted");
        vendingMachine.setVendingMachineState(vendingMachine.getDispensingSnack());
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Please complete payment first.");
    }
}
