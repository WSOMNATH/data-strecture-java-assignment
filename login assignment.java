package proj1;
import java.util.*;
public class login {
	public static void main(String args[]) {
		String user_id ="alpha1020";
		String password ="danger20",lo = "logout";
		String lo1 =null;
		int wrg=0;
		System.out.println("enter the userid : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		while(wrg<4||lo1.equals(lo)){
			
		if(input.equals(user_id) ) {
			System.out.println("enter the password :");
			String p1 = sc.next();
			if(p1.equals(password)) {
				System.out.println("WELCOME ");
					do{
					System.out.println("Enter Logout text ");
					lo1 = sc.next();
					if(lo1.equals(lo))
							System.out.println("\nlogging out....\n");
					}while(!lo1.equals(lo));
						System.exit(1);
			}
			
			else {
				if(wrg<3) {
					System.out.println("enter correct password");
					wrg++;
				}
				
				else
				{
					System.out.println("Wrong Password.Contact Admin exiting system.....");
					System.exit(1);
				}
		}		
	
	}
		else
		{
			if(wrg<3) {
				System.out.println("enter correct username");
				input = sc.next();
				wrg++;
			}
			
			else
			{
				System.out.println("Wrong Username.Contact Admin exiting system.....");
				System.exit(1);
			}
	}
			
}	
		sc.close();
	}
}
