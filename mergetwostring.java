import java.util.Scanner;

public class mergetwostring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String word1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String word2 = sc.nextLine();

        String ans = "";
        int i = 0;

        while (i < word1.length() || i < word2.length()) {

            if (i < word1.length()) {
                ans += word1.charAt(i);
            }

            if (i < word2.length()) {
                ans += word2.charAt(i);
            }

            i++;
        }

        System.out.println("Merged string: " + ans);

        sc.close();
    }
}