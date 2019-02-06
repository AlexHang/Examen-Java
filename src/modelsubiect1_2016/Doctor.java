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
public class Doctor extends CareProvider{
    
    @Override
    public double computeSalary(){
        return 50*this.getNumberOfPatients();
    }
    
}
