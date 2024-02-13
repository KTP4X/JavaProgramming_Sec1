import java.io.*;
import java.util.Scanner;
public class ATMchecking extends ATMData{
 private int money;
 
 public ATMchecking(String ac,String pw,int money) {
	 super(ac,pw);
	 this.money = money;
 }
 public boolean checkBookBank() throws IOException{
		Scanner readFile = new Scanner((new File("d://txtFile//ATMBookBank.txt")));
		boolean found = false;
		while(readFile.hasNext()) {
			String ac = readFile.next();
			 String pw = readFile.next();
			 String money = readFile.next();
			 if(ac.equals(super.getId())&&(pw.equals(super.getPass()))) {
				 found = true ;
			 }
		}return found;
 }
 public void show() {
	 
 }
}
