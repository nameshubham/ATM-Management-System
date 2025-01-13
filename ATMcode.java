import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to ATM");
        System.out.println("Enter PIN");
    
        int pin =sc.nextInt();
        int balance = 90000;
        if (pin==0000){
            System.out.println("select any one option");
            System.out.println("check your balance --> press 1");
            System.out.println("Deposit money --> press 0");
            System.out.println("withdrawal money --> press 6");
            int opt = sc. nextInt();
            if (opt == 1){
        
     System.out.println("Balance remaining is : "+ balance);
     
            }
            else if (opt == 2){
                System.out.println("Enter amount : ");
                int dep=sc .nextInt();
                System.out.println("balance is:" +(balance + dep));
            }
        }
        else {
            System.out.println("Enter amount"); 
            int with =sc.nextInt();
            balance = balance - with;
            System.out.println("Remaining balance is:" +(balance - with));
        }
    }
}
