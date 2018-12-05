public class Review {
    public String body;
    public String author;
    public int stars;

    public Review(String body, String author, int stars) {
        this.body =  body;
        this.author =  author;
        this.stars =  stars;
    }

    public String toString() {
        return this.body + "," + " written by: " + this.author + ", stars: " + this.stars;
    }
    //default constructor!!
    public Review(){}

    public void addReview(String body, String author, int stars){

    }
}
