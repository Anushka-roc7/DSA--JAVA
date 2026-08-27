import java.util.Scanner;

public class countuppercaselowercasespecial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            } else if (ch >= '0' && ch <= '9') {
                digit++;
            } else {
                special++;
            }
        }

        System.out.println("uppercase +" + upper);
        System.out.println("lowercase +" + lower);
        System.out.println("digits +" + digit);
        System.out.println("Special Character+" + special);

    }

}
