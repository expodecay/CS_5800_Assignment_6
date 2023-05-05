public class Snack {

    private String snackWanted;
    private double price;
    private int quantity;

    public Snack(String snkWanted){
        snackWanted = snkWanted;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSnackWanted() {
        return snackWanted;
    }
}
