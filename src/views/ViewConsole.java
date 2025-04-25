package views;
import models.Persona;

public class ViewConsole {
    public void printArray(Persona[] personas){
        System.out.println("Listado de personass :");
        for(Persona persona : personas){
            System.out.println(persona);
        }
    }  
}
