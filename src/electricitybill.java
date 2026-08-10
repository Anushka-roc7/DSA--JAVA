import java.util.Scanner;
public class electricitybill {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int unit=sc.nextInt();
int bill=0;
        if(unit<=100){
            System.out.println( bill=(unit*5));

        }
        else if(unit<=200){
            System.out.println(bill=(unit*5+(unit-100)*7));
        }
        else{
            System.out.println(bill =(unit*5+(unit-200)*10));


        }
        System.out.println("total bill"+bill);


        }
    }

