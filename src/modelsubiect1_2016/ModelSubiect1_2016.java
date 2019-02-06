/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelsubiect1_2016;

/**
 *
 * @author dell
 */
public class ModelSubiect1_2016 {

    /**
     * @param args the command line arguments
     */
    
    
    public static boolean myMethod(){
        int[] myArray = new int[50];
        int aux=0;
        for(int i=0;i<myArray.length;i++){
            myArray[i]=(int)(Math.random()*100);
        }
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i]+" ");
        }
        for(int i=0;i<myArray.length;i++){
            if(myArray[i]%2==0)
                aux++;
            else aux--;
        }
        
        if(aux>0)
            return true;
        else return false;
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Patient p1=new Patient(25, "Ion", "213243564758");
        Patient p2=new Patient(60, "Gheotghe","2134567897568567354");
        Patient p3=new Patient(120, "Vasi :) ", "asdfasdhgdfsgfhjfk");
        
        Doctor d = new Doctor();
        d.addPatient(p1);
        d.addPatient(p2);
        d.addPatient(p3);
        System.out.println("Cel mai batran e: "+d.getOldestPatient());
        System.out.println("Salariul e: "+d.computeSalary());
        System.out.println("Salariul e: "+d.computeSalary(100));
       // System.out.println(myMethod());
    }
    
}
