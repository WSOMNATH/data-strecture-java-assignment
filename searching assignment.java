package proj1;
import java.util.*;
public class searching {
	public static void main(String args[]) {
		int ele=0;
		int a=0;
		int[] array = new int[15];
		for(int i=0;i<15;i++) {
			System.out.println("enter element :");
			Scanner sc = new Scanner(System.in);
			ele=sc.nextInt();
			array[i]=ele;
		}
		for(int i=0;i<15;i++) {
			if(array[i]==19)
				a++;
		}
		if(a==1)
			System.out.println("Element Found....");
		else
			System.out.println("unable to find element");
		System.exit(1);
	}
}
