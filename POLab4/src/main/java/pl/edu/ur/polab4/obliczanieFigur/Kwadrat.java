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
public class Kwadrat {
    float dlugosc;
    float Pole;
    float Obwod;



    public Kwadrat(float x) 
    {
        this.dlugosc = x;
    }
    public void Pole()
    {
        this.Pole =  this.dlugosc* this.dlugosc;
    }
    public void Obwod() {
        this.Obwod = 4* this.dlugosc;
    }

  

     public void kwadrat()

   {
        this.Obwod();
        this.Pole();
        System.out.println("Kwadrat"+"Pole wynosi = " + this.Pole+"Obwód wynosi = " + this.Obwod);
   }
}
