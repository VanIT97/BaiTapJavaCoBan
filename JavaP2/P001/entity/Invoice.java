package JavaP2.P001.entity;

public class Invoice implements Payable{
    private String partNumber;
    private String partDescription;
    private int quanity;
    private double pricePeritItem;

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    public Invoice() {
    }

    public Invoice(String partNumber, String partDescription, int quanity, double pricePeritItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quanity = quanity;
        this.pricePeritItem = pricePeritItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public double getPricePeritItem() {
        return pricePeritItem;
    }

    public void setPricePeritItem(double pricePeritItem) {
        this.pricePeritItem = pricePeritItem;
    }
}
