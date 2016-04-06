/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author H.ONUR
 */

import java.util.Random;
import java.util.Scanner;

public class ComboTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ComboLock lock = new ComboLock();
        int value1, value2, value3, userinput;
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        
        value1 = random.nextInt(51);
        value2 = random.nextInt(51);
        value3 = random.nextInt(51);
        
        lock.comboLock(value1, value2, value3);
        
        System.out.println("the combination for the lock is " + value1 + ", "
            + value2 + ", " + value3);
        
        do{
            lock.reset();
            
            System.out.println("Enter the first number of password");
            userinput = in.nextInt();
            if (userinput > 50){
                do{
                    System.out.println("Enter the first number of password again! ");
                    userinput = in.nextInt();
                } while (userinput > 50);
            }
            lock.turnRight(userinput);
            
            System.out.println("Enter the second number of password");
            userinput = in.nextInt();
            if (userinput > 50){
                do{
                    System.out.println("Enter the second number of password again! ");
                    userinput = in.nextInt();
                } while (userinput > 50);
            }
            lock.turnLeft(userinput);
            
            System.out.println("Enter the third number of password");
            userinput = in.nextInt();
            if (userinput > 50){
                do{
                    System.out.println("Enter the third number of password again! ");
                    userinput = in.nextInt();
                } while (userinput > 50);
            }
            lock.turnRight(userinput);
            
            lock.open();
            
        } while (!(lock.getUnlock()));
    }
    
}
