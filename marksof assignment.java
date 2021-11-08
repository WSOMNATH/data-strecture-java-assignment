package proj1;
import java.util.*;
public class marksof3 {
		public static void main(String args[]) {
			int rp,rc,rm,ap,ac,am,sc1,sp,sm;
			System.out.println("enter the marks scored by Ram :\n");
			System.out.println("Physics :");
			Scanner sc = new Scanner(System.in);
			rp =sc.nextInt();
			System.out.println("chemistry :");
			rc =sc.nextInt();
			System.out.println("Maths :");
			rm =sc.nextInt();
			int rtot = rc+rm+rp;
			int ravg=rtot/3;
			sc.close();
			System.out.println("enter the marks scored by Shyam :\n");
			System.out.println("Physics :");
			//Scanner sc = new Scanner(System.in);
			sp =sc.nextInt();
			System.out.println("chemistry :");
			sc1 =sc.nextInt();
			System.out.println("Maths :");
			sm =sc.nextInt();
			int stot = sc1+sm+sp;
			int savg=rtot/3;
			sc.close();
			System.out.println("enter the marks scored by Ali :\n");
			System.out.println("Physics :");
			//Scanner sc = new Scanner(System.in);
			ap =sc.nextInt();
			System.out.println("chemistry :");
			ac =sc.nextInt();
			System.out.println("Maths :");
			am =sc.nextInt();
			int atot = ac+am+ap;
			int aavg=atot/3;
			sc.close();
			int py=rp+sp+ap;
			System.out.println("subject total,avg Physics:"+py+","+py/3);
			int cy=sc1+rc+ac;
			System.out.println("subject total Chemistry:"+cy);
			int my=rm+sm+am;
			System.out.println("subject total Maths:"+my);
			}
}
