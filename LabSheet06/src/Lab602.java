import javax.swing.*;
public class Lab602 {

	public static void main(String[] args) {
		int year = Integer.parseInt(JOptionPane.showInputDialog(""+ "Input Year"));
		while(!(checkYear(year))) {
		  year = Integer.parseInt(JOptionPane.showInputDialog("Please input year between 1000-3000,\nInput year again"));
		}
		
		if(isLeapYear(year)) {
			JOptionPane.showMessageDialog(null, year+"is Leap Year ");
		}
		else {
			JOptionPane.showMessageDialog(null, year+"is not Leap Year ");
		}
		JOptionPane.showMessageDialog(null,isLeapYear(year)?year+"is Leap Year":year+"is not Leap Year" );
	} //main
	
	public static boolean isLeapYear(int year) {
		if((year%4==0)&&((year%100!=0)||(year%400==0))) {
			return true;
		}
	
		else return false;
	}
	public static boolean checkYear(int year) {
		if(year>=1000&&year<=3000) {
			return true;
		}
	else return false;
	}

}
