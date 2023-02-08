/*Class for a soft drink*/
public class SoftDrink implements Comparable<SoftDrink> {

    String productLine; //type of product
    String company; //manufacturer
    int volume = 0;
    int price = 0;
    //constructor
    public SoftDrink(String productLine) {
        this.productLine = productLine;
    }
    public SoftDrink(String productLine, String company, int volume, int price) {
        this.productLine = productLine;
        this.company = company;
        this.volume = volume;
        this.price = price;
    }
    //Tool for search operation- Based on their productLine
    @Override
    public boolean equals(Object obj) {
        SoftDrink aSD = (SoftDrink) obj;
        return this.productLine.equals(aSD.productLine);
    }
    //Tool for ascending sort by soft drink's price then by product line
    @Override
    public int compareTo(SoftDrink o) {
        int priceDif = this.price - o.price;
        if (priceDif < 0) return -1;
        if (priceDif > 0) return 1;
        return this.productLine.compareTo(o.productLine);
    }
    //convert data of the soft drink to String
    @Override
    public String toString() {
        return productLine + ", " + company + ", " + volume + ", " + price;
    }
}// Soft Drink class
