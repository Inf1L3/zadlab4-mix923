/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

/**
 *
 * @author Mateusz
 */
public class StudentNew {
    public Student[] students=new Student[100];

    public StudentNew() {
    }
    
    public void wprowadzannie(Student tmp,int index)
    {
        students[index]=tmp;
    }
    public void edycja(Student tmp,int index)
    {
        students[index]=tmp;
    }
    public void usun(int index)
    {
        students[index]=null;
    }
    
    public void wyswietlall()
    {
        for(Student tmp:students)
        {
            tmp.pokazDane();
        }
    }
    
    public void wyswietlindex(int index)
    {
       students[index].pokazDane();
    }
    
    public void wyswietlzakres(int min,int max)
    {
        for(int i=min;i<=max;i++)
        {
            students[i].pokazDane();
        }
    }
}
    