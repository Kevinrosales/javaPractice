import java.util.LinkedList;
import java.util.List;

public class Restaurant extends Review{
    public String name;
    public int rating;
    public String price;



    public Restaurant(String name, String price, int rating) {
        this.name =  name;
        this.rating =  rating;
        this.price = price;
    }

    public String toString() {
        return "Name of the Restaurant: " + this.name + ", " + "rating: " + this.rating + ", on a scale of 1-5 the price is: " + this.price;
    }

//    public addReview(Review){}

}
