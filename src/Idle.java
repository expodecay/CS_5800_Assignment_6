public class Idle implements StateOfVendingMachine{


    VendingMachine vendingMachine;

    public Idle(VendingMachine newVendingMachine){
        vendingMachine = newVendingMachine;
    }

    @Override
    public void idle() {
        System.out.println("Current Inventory:");
        System.out.print("Coke....." + vendingMachine.coke_in_machine);
        System.out.println(" Pepsi...." + vendingMachine.pepsi_in_machine);
        System.out.print("Cheetos.." + vendingMachine.cheetos_in_machine);
        System.out.println(" Doritos..." + vendingMachine.doritos_in_machine);
        System.out.print("KitKat..." + vendingMachine.kitkat_in_machine);
        System.out.println(" Snickers.." + vendingMachine.snicker_in_machine + "\n");
    }

    @Override
    public void selectSnack(String snack_location) {

    }

    @Override
    public void insertMoney(Double amount) {

    }

    @Override
    public void dispenseSnack() {

    }
}
