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
public class Patient {
    private int age;
    private String Name;
    private String CNP;
    
    public Patient(int age, String Name, String CNP){
        this.age=age;
        this.Name=Name;
        this.CNP=CNP;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.Name;
    }
    
}
