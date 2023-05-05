public class SodaDispenser implements SnackDispenseHandler {

    private SnackDispenseHandler nextInChain;


    @Override
    public void setNextChain(SnackDispenseHandler nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void calculate(Snack request) {
        if(request.getSnackWanted() == "coke" || request.getSnackWanted() =="pepsi"){
            System.out.println("SODA Dispenser is delivering: " + request.getSnackWanted());
        }else{
            nextInChain.calculate(request); // if add can't handle it, pass to the next in chain
        }
    }
}
