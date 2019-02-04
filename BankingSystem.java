import java.io.*;
class BankAccount {
    private String acc_no;
    private String dateofCreation;
    private String accType;
    private double balance;
    private String first_name;
    private String last_name;
    private String address;
    private String phone_Num;
    private String ifsc;
    private String branch;
    private String aadhar;
    
    void setFirstName(String fname) {
        first_name = fname;
    }
    void setLastName(String lname) {
        last_name = lname;
    }
    void setPhone_Num(String ph_num) {
        phone_Num = ph_num;
    }
    void setAddress(String adress) {
        address = adress;
    }
    void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }
    String getFirstName() {
        return first_name;
    }
}
public class BankingSystem {
    BankingSystem() {
    
    }
    void menu() throws IOException {
        System.out.println("Welcome to IIIT bank !!! ");
        System.out.println("******************");
        System.out.println("Please Choose an option :");
        System.out.println("1. Login \n2. Register \n3. About ");
    }
    int getData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        System.out.println("You entered " + s);
        return s;
    
    }
    
    void login() {
        System.out.println("Enter your Account Number: ");
        System.out.println("Enter your password: ");
    
    }
    void register(BankAccount bank) throws IOException {
        String[] name = new String[10];
        String first_name;
        String last_name;
        String ph_no;
        String address;
        String aadhar;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the following details: ");
        System.out.println("**********");
        System.out.println("Enter your name: ");        
        name = br.readLine().split(" ");
        System.out.println("Enter your phone number: ");
        ph_no = br.readLine();
        System.out.println("Enter your address: ");
        address = br.readLine();
        System.out.println("Enter adhar number: ");
        aadhar = br.readLine();
        first_name = name[0];
        last_name = name[1]; 
        bank.setFirstName(first_name);
        bank.setLastName(last_name);
        bank.setPhone_Num(ph_no);
        bank.setAddress(address);
        bank.setAadhar(aadhar);
    }
    
    void display(BankAccount bank) {
        System.out.println("*****************");
        System.out.println("Welcome: " + bank.getFirstName());
       // System.out.println("Your phone num: "+ bank.getPhoneNum());
        
    }
    public static void main (String[] args) throws IOException{
        BankingSystem wel = new BankingSystem();
        BankAccount b1 = new BankAccount();
        wel.menu();
        int option = wel.getData();
        switch(option) {
        case 1:
            wel.login();break;
        case 2:
            BankAccount bank = new BankAccount();
            wel.register(bank);
            wel.display(bank);
            break;
        case 3:
            System.out.println("Nothing to show !!");
            break;
        default:
            System.out.println("Invalid option");
            break;
        }
        
    }

}
