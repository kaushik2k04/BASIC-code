import java.util.*;
public class Solution {

    public static void main(String[] args) {
        //Your code goes here
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        int c=0;
        if(n==2){
            System.out.print("true");
            return;
        }
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                c++;
                if(i!=n/2){
                    c++;
                }
            }
        }
        if(c==2) System.out.print("true");
        else System.out.print("false");

    }

}
