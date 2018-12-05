public class Shop extends Review{

    public String name;
    public String description;
    public String price;


    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String toString() {
        return "Name of the Shop: " + this.name + ", " + "description: " + this.description + ", on a scale of 1-5 $'s the price is: " + this.price;
    }
}
