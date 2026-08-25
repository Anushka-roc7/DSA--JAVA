import java.util.Scanner;
public class oddstringreverse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
      String s =sc.nextLine();
        String[] words= s.split(" ");
        for(int i=0;i<words.length;i++){
            if(i%2!=0){
                words[i]=new StringBuilder(words[i]).reverse().toString();
            }
        }
        System.out.println(String.join(" ",words));
    }
}
