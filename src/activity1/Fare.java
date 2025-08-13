
package activity1;

import java.util.Scanner;

/**
 *
 * @author susan
 */
public class Fare {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

       
        System.out.print("Distance (km): ");
        int dis = sc.nextInt();

        System.out.print("Class ");
        int cl = sc.nextInt();
    
        if (cl == 1) {
            int total = (int) (dis * 250);
               System.out.println("Total fare: "+total);
        } else {
          int total = dis * 500;
                  if (dis > 1000){
           int distotal = (int) (total * 0.10);
           total = (int) (total - distotal);       
        System.out.println("Total fare: "+total);
                  
        }
        }
    }
}
