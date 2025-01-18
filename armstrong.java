import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scr=new Scanner(System.in);
		String ab=scr.next();
		//String str=a;
		double n=ab.length();
		int a=Integer.parseInt(ab);
		int ans=a;
		double sum=0;
		while(a>0){
			double rem=a%10;
			sum=sum+(Math.pow(rem, n));
			a=a/10;

		}
		if(sum==ans){
			System.out.print("true");
		}
		else{
            System.out.print("false");
		}
		
	}
}
