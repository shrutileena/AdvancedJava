package Programs.com.example.ModArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        ModArrayList<Integer> list = new ModArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.getUsingMod(3));
        System.out.println(list.getUsingMod(-2));
        System.out.println(list.getUsingMod(40));
    }
}
