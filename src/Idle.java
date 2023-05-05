public class Idle implements StateOfVendingMachine{


    VendingMachine vendingMachine;

    public Idle(VendingMachine newVendingMachine){
        vendingMachine = newVendingMachine;
    }

    @Override
    public void idle() {
        System.out.println("Current Inventory:");
        System.out.print("S1 Coke....." + vendingMachine.coke_in_machine);
        System.out.println("   S2 Pepsi...." + vendingMachine.pepsi_in_machine);
        System.out.print("S3 Cheetos.." + vendingMachine.cheetos_in_machine);
        System.out.println("   S4 Doritos..." + vendingMachine.doritos_in_machine);
        System.out.print("S5 KitKat..." + vendingMachine.kitkat_in_machine);
        System.out.println("   S6 Snickers.." + vendingMachine.snicker_in_machine + "\n");
    }

    @Override
    public void selectSnack(String snack_location) {
        System.out.println("Item selected: " + snack_location);
        vendingMachine.setItemLocation(snack_location);
        vendingMachine.setVendingMachineState(vendingMachine.getWaitingForMoney());
    }

    @Override
    public void insertMoney(Double amount) {
        System.out.println("Please select an item.");
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Please select an item and insert payment.");
    }
}
