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
public class Kula {
    
    float promien_kuli;
    float powierzchnia;
    float pole;



    public Kula(float r4) { this.promien_kuli = r4;}

        public void powierzchnia(){  this.powierzchnia = 4*3.14f*this.promien_kuli;}

        public void pole() { this.pole = 4/3*3.14f*(this.promien_kuli*this.promien_kuli*this.promien_kuli);}

    

    

     public void kula(){
        this.pole();
        this.powierzchnia();
        System.out.println("Kula"+"Pole wynosi = " + this.pole+"Obwód wynosi  = " + this.powierzchnia);
    }
}
