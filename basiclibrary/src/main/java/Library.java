import java.util.Arrays;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {
//    public boolean someLibraryMethod() {
//        return true;
//    }
public static void main(String[] args) {

    int[] ans = roll(4);
    System.out.println(Arrays.toString(ans));
    System.out.println(containsDuplicates(ans));
    System.out.println(avg(ans));
}
    public static int[] roll(int n ) {
    int[] thing =  new int[n];
    for (int i = 0; i < n; i++){
        thing[i] = (int)(Math.random() *((6 -1 ) +1 )) +1;
    }
    return thing;
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

    public static int avg (int[] ans){
    int sum = 0;
    for (int i = 0; i <= ans.length - 1; i++ ){
        sum = sum + ans[i];
    }
   return sum / ans.length;
    }
}
