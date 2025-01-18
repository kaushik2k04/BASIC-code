import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scr=new Scanner(System.in);
		int a=scr.nextInt();
		int sum=0;
		while(a>0){
			int rem=a%10;
			sum=sum*10+rem;
			a=a/10;

		}
		System.out.print(sum);

	}
}
