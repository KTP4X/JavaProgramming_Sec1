import javax.swing.*;

import java.text.DecimalFormat;
import java.util.*;
public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		int WithdrawMoney = Integer.parseInt(
				JOptionPane.showInputDialog("Your balance : "+frm.format(balance)+"\nInput money to withdraw : "));
		//if/else if
	    if (WithdrawMoney>balance) {
			JOptionPane.showMessageDialog(null, "Error:cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE );
		}
	    else if(WithdrawMoney>20000) {
			JOptionPane.showMessageDialog(null, "Error:cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		
		}
	
		else if (WithdrawMoney% 100 != 0) {
			JOptionPane.showMessageDialog(null, "Error:cannot withdraw " +WithdrawMoney%100,"ERROR",JOptionPane.ERROR_MESSAGE );
			
		}
		else {
			int thousand = WithdrawMoney/1000;
			int fivehundred = (WithdrawMoney - (thousand * 1000)) / 500;
			int hundred = (WithdrawMoney - (thousand * 1000)-(fivehundred*500))/100;
			JOptionPane.showMessageDialog(null, "You withdraw " +WithdrawMoney+ " baht."+
					"\n1,000 = "+thousand+"\n500 = "+fivehundred+"\n100 = "+hundred);
		}
				
				
		
	}

}
