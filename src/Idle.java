public class Idle implements StateOfVendingMachine{


    VendingMachine vendingMachine;

    public Idle(VendingMachine newVendingMachine){
        vendingMachine = newVendingMachine;
    }

    @Override
    public void idle() {
        System.out.println("Current Inventory:");
        System.out.print("S1 Coke....." + vendingMachine.coke_in_machine + "($2.00)");
        System.out.println("   S2 Pepsi....." + vendingMachine.pepsi_in_machine + "($2.00)");
        System.out.print("S3 Cheetos.." + vendingMachine.cheetos_in_machine + "($1.50)");
        System.out.println("   S4 Doritos..." + vendingMachine.doritos_in_machine + "($1.50)");
        System.out.print("S5 KitKat..." + vendingMachine.kitkat_in_machine + "($1.75)");
        System.out.println("   S6 Snickers.." + vendingMachine.snicker_in_machine+  "($1.75)" + "\n");
    }

    @Override
    public void selectSnack(String snack_location) {
        if(snack_location.equalsIgnoreCase("s1") && vendingMachine.coke_in_machine > 0){
            System.out.println("Item selected: " + snack_location);
            vendingMachine.setItemLocation(snack_location);
            vendingMachine.setVendingMachineState(vendingMachine.getWaitingForMoney());
        }
        else if(snack_location.equalsIgnoreCase("s2") && vendingMachine.pepsi_in_machine > 0){
            System.out.println("Item selected: " + snack_location);
            vendingMachine.setItemLocation(snack_location);
            vendingMachine.setVendingMachineState(vendingMachine.getWaitingForMoney());
        }
        else if(snack_location.equalsIgnoreCase("s3") && vendingMachine.cheetos_in_machine > 0){
            System.out.println("Item selected: " + snack_location);
            vendingMachine.setItemLocation(snack_location);
            vendingMachine.setVendingMachineState(vendingMachine.getWaitingForMoney());
        }
        else if(snack_location.equalsIgnoreCase("s4") && vendingMachine.doritos_in_machine > 0){
            System.out.println("Item selected: " + snack_location);
            vendingMachine.setItemLocation(snack_location);
            vendingMachine.setVendingMachineState(vendingMachine.getWaitingForMoney());
        }
        else if(snack_location.equalsIgnoreCase("s5") && vendingMachine.kitkat_in_machine > 0){
            System.out.println("Item selected: " + snack_location);
            vendingMachine.setItemLocation(snack_location);
            vendingMachine.setVendingMachineState(vendingMachine.getWaitingForMoney());
        }
        else if(snack_location.equalsIgnoreCase("s6") && vendingMachine.snicker_in_machine > 0){
            System.out.println("Item selected: " + snack_location);
            vendingMachine.setItemLocation(snack_location);
            vendingMachine.setVendingMachineState(vendingMachine.getWaitingForMoney());
        }
        else{
            System.out.println("No Inventory for " + snack_location +" Please select another item.");
            vendingMachine.setVendingMachineState(vendingMachine.getIdle());
        }
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
