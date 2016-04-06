/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author H.ONUR
 */
public class ComboLock {
    
    private boolean situation = true;
    private boolean flag1, flag2, flag3;
    private int secret1, secret2, secret3;
    private boolean unlock;

    public void comboLock(int secret1, int secret2, int secret3){
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
    }
    
    public void turnRight(int clicks){
        if (situation){
            flag1 = false;
            situation = false;
            
            if (clicks == secret1){
                flag1 = true;
            }
        } 
        else{
            flag3 = clicks == secret3;
        }
    }
    
    public void turnLeft(int clicks){
        flag2 = clicks == secret2;
    }
    
    public void reset(){
        situation = true;
        flag1 = false;
        flag2 = false;
        flag3 = false;
    }
    
    public void open(){
        if (!(flag1 && flag2 && flag3)){
            unlock = false;
            System.out.println("Incorrect combination, Please try again.");
        }
        else{
            System.out.println("The lock is open.");
            unlock = true;
        }
    }
    
    public boolean getUnlock(){
        return unlock;
    }
}