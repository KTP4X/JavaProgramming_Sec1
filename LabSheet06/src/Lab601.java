import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		inputEmail();
	}//end of main method	
	
	public static void inputEmail() {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail:").toLowerCase();
		while(inputEmail.startsWith("@")||inputEmail.startsWith("")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail,again :");
		
		
		boolean validateEmail = checkEmail(inputEmail);
		if(validateEmail==true) {
			JOptionPane.showMessageDialog(null,
					"Your e-mail is "+ inputEmail);
		}
		else {
			JOptionPane.showMessageDialog(null,
					"Your e-mail is not hotmail or gmail dot com");
		}
}
	
	

}
public static boolean checkEmail(String email) {
	if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
      return true;
	}
	else return false;

	
}

}