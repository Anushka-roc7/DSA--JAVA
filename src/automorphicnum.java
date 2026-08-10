import java.util.*;
public class automorphicnum {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square=n*n;
       // System.out.println("Square");
        if(square%10==n){
            System.out.println("Automorphic num");
        }
        else{
            System.out.println("not an automorphic num");
        }
    }
}
