package proj1;

import java.util.Scanner;

public class marks {
	public static void main(String args[]) {
		double p,c,m;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter Physics marks :");
		p=sc.nextDouble();
		System.out.println("enter chemistry marks :");
		c=sc.nextDouble();
		System.out.println("enter Mathematics marks :");
		m=sc.nextDouble();
		if(p>=60.00&&c>=60.00&&m>=60.00)
			System.out.println("RESULT : passed");
		else
			if(p>=60.00&&c>=60.00&&m<60||p<60&&c>=60&&m>=60||p>=60&&c<60&&m>=60)
				System.out.println("RESULT : promoted");
			else
				if(p>=60||c>=60||m>=60&&p<60||m<60||c<60)
					System.out.println("FAILED");
	}
}
