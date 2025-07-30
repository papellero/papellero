
package activity2;

import java.util.Scanner;

public class activity2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter employee name: ");
        String ename = sc.nextLine();
         System.out.print("Enter hourly rate: ");
         float hrate = sc.nextFloat();
         System.out.println("Enter total hours worked: ");
         float hours = sc.nextFloat();
         
         System.out.println("-----Wage Summary-----");
         System.out.println("Employe: "+ename);
         System.out.println("Hour worked: "+hrate);
         System.out.println("Gross weEKLY Wage: "+(hours*hrate));
         System.out.println("SSS Contributions(10%%): P%.2f)\n"+(hours*hrate)*0.1);
         System.out.println("--------");
         System.out.printf("Net Weekly Wage: P%.2f\n\n",((hours*hrate)-((hours*hrate)*0.1)));
         
    }
}
         
           
            
            
    

