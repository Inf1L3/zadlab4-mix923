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
public class Szescian {
    double bok;

    public Szescian(double x) {

        this.bok = x;

    }    

    public double Objetnosc(){

    double objetosc;

    objetosc=bok*bok*bok;

    return objetosc;

    }

     public double powierzchnia(){

    double powierzchnia;

    powierzchnia=6*(bok*bok);

    return powierzchnia;

    }
    
     public void Pokaz()
    { 
       System.out.println("Dlugosc boku Szescianu:" + bok +"Powierzchnia Szescianu:" + Objetnosc()+ "Objetosc Szescianu:" + powierzchnia());
    }
}
