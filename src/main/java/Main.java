public class Main {
    public static void main(String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(2);
    }
    public static String pluralize(String animal, int num) {
        if (num == 0 || num > 1) {
            animal = animal + "s";
        }
        return animal;
    }
    public static void flipNHeads(int n) {
        int head = 0;
        int timesFlipped;
        for (timesFlipped = 0; head < n; timesFlipped++) {
            double rando = Math.random();
            if (rando < 0.5) {
                System.out.println("Tails");
            } else {
                System.out.println("Heads");
                head++;
            }
        }
        System.out.println("It took " + timesFlipped + " flips to flip " + n + " heads in a row.");

    }
}
