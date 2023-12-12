import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name:");
		String fullname = scan.nextLine();
		int space = fullname.trim().indexOf(" ");
		if(space==-1) {
			System.out.print("Incorrect Name: ");
		}else {
			String First = fullname.substring(0,space);
			String Last  = fullname.substring(space+1);
			System.out.println("First Name: "+ First.toUpperCase());
			System.out.println("Last Name: "+Last.toLowerCase());
		}

	}

}
