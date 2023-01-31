import java.util.ArrayList;

public class Client extends Human{
    private static int latestId = 1;
    private ArrayList<Purchase> purchaseList;
    private final int id;
    Client(int age, String name, String secondName) {
        super(age, name, secondName);
        this.purchaseList= new ArrayList<Purchase>();
        this.id = latestId;
        latestId += 1;
    }

    public ArrayList<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public int getId() {
        return id;
    }

    public void addPurchaseList(Purchase purchase) {
        this.purchaseList.add(purchase);
    }

}
