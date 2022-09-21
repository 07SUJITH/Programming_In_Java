import java.util.ArrayList;
import java.util.Collections;
// sort array lists  
public class Program22 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(10);
            numbers.add(22);
            numbers.add(3);
            numbers.add(0);
            numbers.add(-1);
            System.out.println(numbers);
            Collections.sort(numbers);
            System.out.println(numbers);
    }
        
}
