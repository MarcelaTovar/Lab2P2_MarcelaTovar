
package lab2p2_marcelatovar;

import java.util.*;
public class Lab2P2_MarcelaTovar {

   
    public static void main(String[] args) {
        
    }
    
    public static void menu(){
        ArrayList objetos = new ArrayList();
        ArrayList <Usuario>  user = new ArrayList<Usuario>();
        
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
    
    public static void registro(ArrayList objetos){
        boolean salir = true;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("--Menu Registro--");
            System.out.println("1.Crear\n2.Listar\n3.Modificar\n4.Borrar\n5.Vender");
            int opcion = leer.nextInt();
            int opcionLugar = 0;
            switch(opcion){
                case 1->{
                    System.out.println("1. Casas\n2.Edificios\n3.Solares");
                    opcionLugar = leer.nextInt();
                    switch(opcionLugar){
                        case 1->{
                            
                        }
                        case 2 ->{
                            
                        }
                        case 3 ->{
                            
                        }
                    }
                }
                case 2->{
                    System.out.println("1. Casas\n2.Edificios\n3.Solares");
                    opcionLugar = leer.nextInt();
                    switch(opcionLugar){
                        case 1->{
                            
                        }
                        case 2 ->{
                            
                        }
                        case 3 ->{
                            
                        }
                    }
                }
                case 3->{
                    System.out.println("1. Casas\n2.Edificios\n3.Solares");
                    opcionLugar = leer.nextInt();
                    switch(opcionLugar){
                        case 1->{
                            
                        }
                        case 2 ->{
                            
                        }
                        case 3 ->{
                            
                        }
                    }
                }
                case 4->{
                    System.out.println("1. Casas\n2.Edificios\n3.Solares");
                    opcionLugar = leer.nextInt();
                    switch(opcionLugar){
                        case 1->{
                            
                        }
                        case 2 ->{
                            
                        }
                        case 3 ->{
                            
                        }
                    }
                }
            }
        }while(salir);
    }
    
}
