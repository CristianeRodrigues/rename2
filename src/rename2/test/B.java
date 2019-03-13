/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rename2.test;

import rename2.A;

/**
 *
 * @author Cristiane
 */
public class B {
      int B;
      A ClassA;
    
    public void setB(int B){
        this.B = B;
        ClassA.setA(B);
    }
}
