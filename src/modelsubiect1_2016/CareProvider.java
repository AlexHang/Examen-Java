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
public abstract class CareProvider {
    private Patient[] patients = new Patient[50];
    private int noPatients=0;
    
    public void addPatient(Patient p){
        patients[noPatients++]=p;
    }
    public String getOldestPatient(){
        int age=0;
        String Name=" ";
        for(int i=0;i<noPatients;i++){
            if(patients[i].getAge()>age){
                age=patients[i].getAge();
                Name=patients[i].getName();
            }
        }
        
        return Name;
    }
    
    public int getNumberOfPatients(){
        return noPatients;
    }
    
    public abstract double computeSalary();
}
