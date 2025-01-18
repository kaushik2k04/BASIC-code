import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scr =new Scanner(System.in);
        System.out.println("Enter the Student Input");
        int num1=scr.nextInt();
        if(num1 >=90){
            System.out.println("Grade A");
        }
        else if(num1>=80 && num1<=89){
            System.out.println("Grade B");
        }
        else if(num1>=70 && num1<=79){
            System.out.println("Grade C");
        }
        else if(num1>=60 && num1<=69){
            System.out.println("Grade D");
        }
        else if(num1 <=60){
            System.out.println("Grade F");
        }
    }
}
