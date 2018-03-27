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
public class Prostokat {
     int a;
     int b;
     int obwod;
     int pole;



    public Prostokat(int a, int b) {

        this.a = a;

        this.b = b;

    }

    public void Obwod()
    {    
        this.obwod = (2*this.a)+(2*this.b);
    }

    public void Pole(){    
        this.pole =this.a*this.b;
    }

   

    

      public void prostokąt(){
        this.Pole();
        this.Obwod();
        System.out.println("Prostokąt"+"Pole wynosi = " + this.pole+"Obwód wynosi = " + this.obwod);
    }
}
