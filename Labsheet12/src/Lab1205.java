import java.io.*;
import java.util.*;
public class Lab1205 {
 
	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//student.txt"));
		Header();
		int i =1;
		while (readFile.hasNext()) {
			String id = readFile.next();
			readFile.next();
			String Fname = readFile.next().substring(0,1).toUpperCase();
			String Lname = readFile.next();
			double grade = readFile.nextDouble();
			readFile.next();
			System.out.println(i+".\t"+id+"\t\t"+Level(id)+"\t"+Fname+"."+Lname+"\t\t"+grade+"\t"+Status(grade));	
			i++;
		}
	}
	public static String Level(String id) {
		int spd = Integer.parseInt(id.substring(0,2));
		int year = 22-spd ;
		return year +"th";
	}
	public static String Status (double grade) {
		if(grade>=2) {
			return "Pass" ;
		}
		else if(grade >=1 &&grade<2)
			return "Critical";
		else return"Retired";
 
	}
	public static void Header() {
		System.out.println("\tNo.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("************************************************************************************");
		
	}
}