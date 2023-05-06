public class ChochlateDispenser implements SnackDispenseHandler {

    private SnackDispenseHandler nextInChain;


    @Override
    public void setNextChain(SnackDispenseHandler nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void calculate(Snack request) {
        if(request.getSnackWanted() == "kitkat" || request.getSnackWanted() == "snickers"){
            System.out.println("CHOCOLATE Dispenser is delivering: " + request.getSnackWanted());
        }else{
            nextInChain.calculate(request); // end of chain
        }
    }
}