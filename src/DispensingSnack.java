public class DispensingSnack implements StateOfVendingMachine{

    VendingMachine vendingMachine;

    SnackDispenseHandler snack1;
    SnackDispenseHandler snack2;
    SnackDispenseHandler snack3;

    public DispensingSnack(VendingMachine newVendingMachine){
        vendingMachine = newVendingMachine;

        snack1 = new SodaDispenser();
        snack2 = new ChipDispenser();
        snack3 = new ChochlateDispenser();

        snack1.setNextChain(snack2);
        snack2.setNextChain(snack3);
    }

    @Override
    public void idle() {

    }

    @Override
    public void selectSnack(String snack_location) {

    }

    @Override
    public void insertMoney(Double amount) {

    }

    @Override
    public void dispenseSnack() {
        if(vendingMachine.item_location == "s1") {
            Snack request = new Snack("coke");
            vendingMachine.setCokeInMachine(vendingMachine.coke_in_machine - 1);
            snack1.calculate(request);
        }
        if(vendingMachine.item_location == "s2") {
            Snack request = new Snack("pepsi");
            vendingMachine.setPepsiInMachine(vendingMachine.pepsi_in_machine - 1);
            snack1.calculate(request);
        }
        if(vendingMachine.item_location == "s3") {
            Snack request = new Snack("cheetos");
            vendingMachine.setCheetosInMachine(vendingMachine.cheetos_in_machine - 1);
            snack1.calculate(request);
        }
        if(vendingMachine.item_location == "s4") {
            Snack request = new Snack("doritos");
            vendingMachine.setDoritosInMachine(vendingMachine.doritos_in_machine - 1);
            snack1.calculate(request);
        }
        if(vendingMachine.item_location == "s5") {
            Snack request = new Snack("kitkat");
            vendingMachine.setkitkatInMachine(vendingMachine.kitkat_in_machine - 1);
            snack1.calculate(request);
        }
        if(vendingMachine.item_location == "s6") {
            Snack request = new Snack("snickers");
            vendingMachine.setSnickersInMachine(vendingMachine.snicker_in_machine - 1);
            snack1.calculate(request);
        }
        vendingMachine.setVendingMachineState(vendingMachine.getIdle());
    }
}
