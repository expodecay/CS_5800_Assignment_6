import javax.swing.plaf.nimbus.State;

public class VendingMachine {

    /////////////////////Context(Account)/////////////////////

    StateOfVendingMachine idle;
    StateOfVendingMachine waiting_for_money;
    StateOfVendingMachine dispensing_snack;
    StateOfVendingMachine machine_out_of_order;

    StateOfVendingMachine machine_state;

    int coke_in_machine = 10;
    int pepsi_in_machine = 10;
    int cheetos_in_machine = 10;
    int doritos_in_machine = 10;
    int kitkat_in_machine = 10;
    int snicker_in_machine = 10;

    boolean enough_items_in_machine = true;

    public VendingMachine(){
        idle = new Idle(this);
        /*waiting_for_money = new WaitingForMoney(this);
        dispensing_snack = new DispensingSnack(this);
        machine_out_of_order = new OutOfItem(this);*/

        machine_state = idle;

        if(coke_in_machine==0 && pepsi_in_machine==0 && cheetos_in_machine==0 && doritos_in_machine==0 && kitkat_in_machine==0 && snicker_in_machine==0){
            machine_state = machine_out_of_order;
        }
    }

    void setVendingMachineState(StateOfVendingMachine new_machine_state){
        machine_state = new_machine_state;
    }

    public void setCokeInMachine(int new_coke_count){
        coke_in_machine = new_coke_count;
    }
    public void setPepsiInMachine(int new_coke_count){
        pepsi_in_machine = new_coke_count;
    }
    public void setCheetosInMachine(int new_cheetos_count){
        cheetos_in_machine = new_cheetos_count;
    }
    public void setDoritosInMachine(int new_doritos_count){
        doritos_in_machine = new_doritos_count;
    }
    public void setkitkatInMachine(int new_kitkat_count){
        kitkat_in_machine = new_kitkat_count;
    }
    public void setSnickersInMachine(int new_snickers_count){
        snicker_in_machine = new_snickers_count;
    }

    public void idle(){
        machine_state.idle();
    }
    public void selectSnack(String snack_location){
        machine_state.selectSnack(snack_location);
    }
    public void insertMoney(Double amount){
        machine_state.insertMoney(amount);
    }
    public void dispenseSnack(){
        machine_state.dispenseSnack();
    }

    // return state objects
    public StateOfVendingMachine isIdle(){
        return idle;
    }

    public StateOfVendingMachine isWaitingForMoney(){
        return  waiting_for_money;
    }

    public StateOfVendingMachine getDispensingSnack(){
        return dispensing_snack;
    }

    public StateOfVendingMachine isOutOfOrder(){
        return machine_out_of_order;
    }
}
