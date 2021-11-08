package proj1;
import java.math.*;
public class armstrong1 {
	
	public static boolean arms(int n) {
		int fv = 0,temp,sum=0;
		temp=n;
		while(temp>0) {
			temp=temp/10;
			fv++;
		}
		temp=n;
		while(temp>0) {
			int last=temp%10;
			sum+=Math.pow(last, fv);
			temp=temp/10;
		}
		if(sum==n)
			return true;
		else 
			return false;
		
	}
	public static void main(String args[]) {
		int i;
		for(i=100;i<=999;i++)
			if(arms(i)) 
				System.out.println(i+",");
	}
}