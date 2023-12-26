import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter your fullname");
         String fullname = scan.nextLine();
         String firstname = fullname.substring(0,fullname.indexOf(' '));
         String abbname = abbreviatName(fullname);
         
	}
	public static String abbreviatName (String fullname) {
		String name = "";
		for(int i = 0; i< fullname.length();i++) {
			if(fullname.charAt(i)==' ' ) {
				name = name+fullname.charAt(1) +".";
			}
		}
		return name;
		
	}
    
}
