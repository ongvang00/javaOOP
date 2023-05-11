public class Product {
    String productName;
    public double productCost;
    public int productQuantity;

    //Constructor

    public Product(String productName, double productCost, int productQuantity) {
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
    }

    public double totalCost () {
        return this.productCost * this.productQuantity;
    }

    public void printProduct () {
        System.out.println (this.productName + " cost " + this.productCost + " and "
                + this.productQuantity + " were purchased. Total cost is " + totalCost());
    }
}
