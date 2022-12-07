package Programs.com.example.OddArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    
    // common functionality. Works same for OddArrayList and ArrayList
    public static void addRandomNumber(ArrayList<Integer> list) {
        int originalSize = list.size();
        Random random = new Random();
        while (originalSize + 1 != list.size()) {
            int n = random.nextInt(1000);
            list.add(n);
        }
    }
    public static void main(String[] args) {
        
        OddArrayList oddListy = new OddArrayList(1,2,3,4,7,9,-13);

        addRandomNumber(oddListy);
        System.out.println(oddListy);

        ArrayList<Integer> listy = new ArrayList<>();

        listy.add(1);
        listy.add(2);
        listy.add(3);
        listy.add(4);
        listy.add(7);
        listy.add(9);
        listy.add(-13);
        addRandomNumber(listy);

        System.out.println(listy);
    
            // OddArrayList oddListy = new OddArrayList(7);
            // oddListy.add(1);   // add method here works for OddArrayList
            // oddListy.add(2);
            // addRandomNumber(oddListy);
            // System.out.println(oddListy);
    
            // ArrayList<Integer> listy = new ArrayList<>();
            // listy.add(1);        // add method here works for ArrayList
            // listy.add(2);
            // addRandomNumber(listy);
            // System.out.println(listy);
    }
}
