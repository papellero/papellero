package activity1;

import banking.bankingClass;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        bankingClass bank = new bankingClass();
        int attemp = 3;
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = in.nextInt();
        
        switch(choice){
            case 1:
             while (  attemp != 0){
                
                
                System.out.println("Enter your Account No: ");
                int accountNo = in.nextInt();

                System.out.println("Enter your Pin: ");
                int pin = in.nextInt();
                
                if(bank.verifyAccount(accountNo, pin)){
                    System.out.println("LOGIN SUCCESS");
                    System.exit(0);
                }else{
                    attemp--;
                    System.out.println("INVALID ACCOUNT!"+attemp);
                }
                if ( attemp == 0){
                    System.out.println("Try Again!");
                            
                            
                }
                
             }   
                break;
                
                case 2:
                    break;
                case 3:                
                break;
                default:
                
        
            }
        }
            
    }
    

