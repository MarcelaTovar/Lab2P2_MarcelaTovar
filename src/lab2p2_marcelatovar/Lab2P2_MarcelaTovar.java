
package lab2p2_marcelatovar;

import java.util.*;
public class Lab2P2_MarcelaTovar {

   
    public static void main(String[] args) {
        
    }
    
    public static void menu(){
        Scanner leer = new Scanner(System.in);
        boolean terminar = true;
        boolean log = false;
        do{
            System.out.println("1.Registro de Inmueble/Solar\n2.Manejo de Estados\n3.Login/Sign-up\n4.Salir");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1 ->{
                    if (log) {
                        
                    }else{
                        System.out.println("Porfavor ingrese la sesion");
                    }
                }
                case 2->{
                    if (log) {
                        
                    }else{
                        System.out.println("Profavor ingrese la sesion");
                    }
                }
                case 3->{
                    log = true;
                }
                case 4->{
                    if (log) {
                        terminar = false;
                    }else{
                        System.out.println("Porfavor ingrese la sesion");
                    }
                    
                }
            }
        }while(terminar);
    }
    
}
