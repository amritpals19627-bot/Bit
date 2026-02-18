import java.util.*;
public class update_bit {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int n = 5; // 101
        System.out.println("enter the position");

        int position = sc.nextInt();
        int bitwise = 1<<posi;

        // just checking

        // get bit
        int getbit = bitwise & n;

        System.out.println(getbit);

        if (getbit == 0) {
            System.out.println("bit is 0");
        } else {
            System.out.println("bit is not 0");
        }
                // update bit
        System.out.println("enter the operation");
        int operation = sc.nextInt();

        if (operation == 1) {
            int set_1 = bitwise | n;
            System.out.println(set_1); 
        } else {
            int newbitwise = ~(bitwise);
            int clear_bit = newbitwise & n;
            System.out.println(clear_bit);
        }
    }
    
}
