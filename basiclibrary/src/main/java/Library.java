import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;


public class Library {

    public static int[] roll(int rolls) {
        int[] values = new int[rolls];
        Random rnd = new Random();
        for (int i = 0; i < values.length; i++) {
            int roll = rnd.nextInt(6) + 1;
            values[i] = roll;
        }
        return values;
    }

    public static boolean containsDuplicates (int[] ans){
        for (int i = 0; i < ans.length; i++){
            for (int j = i + 1; j < ans.length; j++){
                if (ans[i] == ans[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static double average(int[] arr) {
        double average = 0;
        for (int value : arr)
            average += value;
        return average/ (double)arr.length;
    }

    public static void analyzeData() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        HashSet<Integer> temps = new HashSet<>();
        int high = weeklyMonthTemperatures[0][0];
        int low = weeklyMonthTemperatures[0][0];

        for (int[] arr : weeklyMonthTemperatures) {
            for (int temp : arr) {

                if (temp > high){
                    high = temp;
                }
                else if (temp < low) {
                    low = temp;
                }

                temps.add(temp);
            }
        }

        System.out.println("High: " + high);
        System.out.println("Low: " + low);
        for (int i = low; i < high; i++) {
            if (!temps.contains(i)) {
                System.out.println("Never saw temperature: " + i);
            }

        }
    }
}