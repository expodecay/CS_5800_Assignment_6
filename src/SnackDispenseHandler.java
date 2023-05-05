public interface SnackDispenseHandler {

    public void setNextChain(SnackDispenseHandler nextChain);

    public void calculate(Snack request);
}
