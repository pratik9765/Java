public class accessSpecifiers {
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Pratik";
        // myAcc.password = "qwert";  Erroe
        myAcc.setPassword("Pratik");
    }    
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String newPassword){
        password = newPassword;
    }

}
