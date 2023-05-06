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

        if(vendingMachine.item_location.equalsIgnoreCase("s1") && vendingMachine.getCokePrice() < amount){
            vendingMachine.setVendingMachineState(vendingMachine.getDispensingSnack());
            System.out.println("Your Change: $" + (amount - vendingMachine.getCokePrice()));
        }
        else if(vendingMachine.item_location.equalsIgnoreCase("s2") && vendingMachine.getPepsiPrice() < amount){
            vendingMachine.setVendingMachineState(vendingMachine.getDispensingSnack());
            System.out.println("Your Change: $" + (amount - vendingMachine.getPepsiPrice()));
        }
        else if(vendingMachine.item_location.equalsIgnoreCase("s3") && vendingMachine.getCheetosPrice() < amount){
            vendingMachine.setVendingMachineState(vendingMachine.getDispensingSnack());
            System.out.println("Your Change: $" + (amount - vendingMachine.getCheetosPrice()));
        }
        else if(vendingMachine.item_location.equalsIgnoreCase("s4") && vendingMachine.getDoritosPrice() < amount){
            vendingMachine.setVendingMachineState(vendingMachine.getDispensingSnack());
            System.out.println("Your Change: $" + (amount - vendingMachine.getDoritosPrice()));
        }
        else if(vendingMachine.item_location.equalsIgnoreCase("s5") && vendingMachine.getKitkatPrice() < amount){
            vendingMachine.setVendingMachineState(vendingMachine.getDispensingSnack());
            System.out.println("Your Change: $" + (amount - vendingMachine.getKitkatPrice()));
        }
        else if(vendingMachine.item_location.equalsIgnoreCase("s6") && vendingMachine.getSnickersPrice() < amount){
            vendingMachine.setVendingMachineState(vendingMachine.getDispensingSnack());
            System.out.println("Your Change: $" + (amount - vendingMachine.getSnickersPrice()));
        }
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Please complete payment first.");
    }
}
