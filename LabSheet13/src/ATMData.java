
public class ATMData {
    private String accountNumber;
    private  String password;
    public ATMData(String ac, String pw) {
    	this.accountNumber = ac;
    	this.password = pw;
    }
    public String getId() {
    	return accountNumber;
    	
    }
    public String getPass() {
    	return password;
    }
    
}
