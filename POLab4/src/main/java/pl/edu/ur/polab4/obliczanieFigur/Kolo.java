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
public class Kolo {
    
    
    float R;
    float Obwod;
    float Pole;



    public Kolo(float r) 
    { 
        this.R = r;
    }
    public void  Obwod(){
        this.Obwod = (float) (2*3.14f*this.R);
    }
    public void  Pole() {
        this.Pole = (float) (3.14f*(this.R*this.R)); 
    }



   

   public void Kolo_info()

   {
        this.Pole();
        this.Obwod();
        System.out.println("Koło" +"Pole wynosi = " + this.Pole +"Obwód wynosi = " + this.Obwod );

   }
}
