package proj1;
import java.util.*;
public class intrest {

	public static void main(String[] args) {
		double p,n,r,si,ci;
		System.out.println("enter the intrest type 1.simple\n2.compound intrest");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch(num) {
		case 1 :System.out.println("enter principle: ");
				p=sc.nextDouble();
				System.out.println("enter duration in years: ");
				n=sc.nextDouble();
				System.out.println("enter Intrest rate: ");
				r=sc.nextDouble();
				si=p*n*r;
				System.out.println("simple intrest is: "+si);
				break;
		case 2 :System.out.println("enter principle: ");
				p=sc.nextDouble();
				System.out.println("enter duration in years: ");
				n=sc.nextDouble();
				System.out.println("enter Intrest rate: ");
				r=sc.nextDouble();
				ci=p*n*r;
		break;
		}
	}

}
