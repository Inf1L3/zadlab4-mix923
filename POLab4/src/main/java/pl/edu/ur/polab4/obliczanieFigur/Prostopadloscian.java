/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Mateusz
 */
public class Prostopadloscian {
    float A,C,S,powierzchnia,pole;

  
    public Prostopadloscian(float a3, float b3, float h3) {

        this.A = a3;

        this.C = b3;

        this.S = h3;
    }

    public void powierzchnia(){ 
        this.powierzchnia =  this.A* this.C* this.S;
    }

    public void pole(){ 
        this.pole = 2*this.A*this.C+2*this.A*this.S+2*this.C*this.S;
    }

    

    

     public void prostopadłoscian(){
        this.pole();
        this.powierzchnia();
        System.out.println("Prostopadłościan"+"Pole wynosi = " + this.pole+"Obwód wynosi = " + this.powierzchnia);
    }
}
