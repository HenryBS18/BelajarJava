package mine;
import java.lang.Math;

public class condition {
    public static void main(String[] args) {
        
        int i;

        i = 0;
        
        while (i<1000) {
            i++;
            System.out.println(String.format("%,.0f", Math.pow(i, 2)));
        }
        System.out.println("Total Loop : " + i++);
    }
}