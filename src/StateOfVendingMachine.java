public interface StateOfVendingMachine {


    void idle(); // start state
    void selectSnack(String snack_location);
    void insertMoney(Double amount); // if money >= price, dispense item after checking quantity
    void dispenseSnack();
}
