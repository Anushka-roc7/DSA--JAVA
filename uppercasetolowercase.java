import java.util.Scanner;

public class uppercasetolowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = str.toUpperCase();

        System.out.println("Uppercase: " + result);

    }
}