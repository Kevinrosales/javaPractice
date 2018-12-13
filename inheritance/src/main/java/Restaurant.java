import java.text.DecimalFormat;
import java.util.ArrayList;

public class Restaurant extends Review{
    public String name;
    public float numStars;
    public String price; //i.e. number of dollar signs).

    public Restaurant(String name, int numStars, String price) {
        this.name = name;
        this.numStars = numStars;
        this.price = price;

    }

    @Override
    public String toString() {
        DecimalFormat K = new DecimalFormat("##.0");
        return this.name + K.format(this.numStars) + this.price;
    }

    public void addReview(Review review) {
        ArrayList<Integer> starArray = new ArrayList<>();
        starArray.add(review.numStars);
        if(this.numStars<0){
            float sum =this.numStars +review.numStars;
            this.numStars = sum/starArray.size();
        }else{
            float sum =this.numStars +review.numStars;
            this.numStars = sum/(starArray.size()+1);
        }

    }

}
