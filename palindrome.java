
public class Solution {
    public static boolean palindromeNumber(int a){
        // Write your code here.
        int ans=a;
		int sum=0;
		while(a>0){
			int rem=a%10;
			sum=sum*10+rem;
			a=a/10;

		}
        if(sum==ans){
            return true;
        }
		return false;
    }
}
