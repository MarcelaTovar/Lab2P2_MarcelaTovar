package lab2p2_marcelatovar;

import java.awt.Color;
import java.util.*;
import javax.swing.JColorChooser;

public class Lab2P2_MarcelaTovar {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        ArrayList objetos = new ArrayList();
        ArrayList<Usuario> user = new ArrayList<Usuario>();

        Scanner leer = new Scanner(System.in);
        boolean terminar = true;
        boolean log = false;
        do {
            System.out.println("1.Registro de Inmueble/Solar\n2.Manejo de Estados\n3.Login/Sign-up\n4.Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1 -> {
                    if (log) {
                        registro(objetos);
                    } else {
                        System.out.println("Porfavor ingrese la sesion");
                    }
                }
                case 2 -> {
                    if (log) {

                    } else {
                        System.out.println("Profavor ingrese la sesion");
                    }
                }
                case 3 -> {
                    log = logOrSign(user, terminar);

                }
                case 4 -> {
                    if (log) {
                        terminar = false;
                    } else {
                        System.out.println("Porfavor ingrese la sesion");
                    }

                }
            }
        } while (terminar);
    }

    public static void registro(ArrayList objetos) {
        boolean salir = true;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("--Menu Registro--");
            System.out.println("1.Crear\n2.Listar\n3.Modificar\n4.Borrar\n5.Vender");
            int opcion = leer.nextInt();

            int opcionLugar = 0;
            switch (opcion) {
                case 1 -> {
                    System.out.println("1. Casas\n2.Edificios\n3.Solares");
                    opcionLugar = leer.nextInt();
                    switch (opcionLugar) {
                        case 1 -> {
                            System.out.println("Ingrese el numero de casas: ");
                            int numeroCasas = leer.nextInt();
                            System.out.println("Ingrese el numero de bloque: ");
                            int numeroBloque = leer.nextInt();
                            System.out.println("Ingrese el color: ");
                            Color color = JColorChooser.showDialog(null, "Ingrese color: ", Color.red);
                            System.out.println("Ingrese el ancho: ");
                            double ancho = leer.nextDouble();
                            System.out.println("Ingrese el largo: ");
                            double largo = leer.nextDouble();
                            System.out.println("Ingrese el numero de banios: ");
                            int banios = leer.nextInt();
                            System.out.println("Ingrese el numero de cuartos: ");
                            int cuarto = leer.nextInt();
                            Casa casa = new Casa(numeroCasas, numeroBloque, color, ancho, largo, banios, cuarto);
                            objetos.add(casa);
                        }
                        case 2 -> {
                            System.out.println("Ingrese el numero de pisos: ");
                            int numeroPisos = leer.nextInt();
                            System.out.println("Ingrese la cantidadd de locales: ");
                            int cantidadLocales = leer.nextInt();
                            System.out.println("Ingrese la direccion de referencia: ");
                            String ref = leer.nextLine();
                            Edificio edificio = new Edificio(numeroPisos, cantidadLocales, ref);
                            objetos.add(edificio);
                        }
                        case 3 -> {
                            System.out.println("Ingrese el largo: ");
                            int largo = leer.nextInt();
                            System.out.println("Ingrese el ancho: ");
                            int ancho = leer.nextInt();
                            System.out.println("Ingrese el duenio: ");
                            String duenio = leer.nextLine();
                            Solar solar = new Solar(ancho, largo, duenio);
                            objetos.add(solar);
                        }

                    }
                }
                case 2 -> {
                    System.out.println("1. Casas\n2.Edificios\n3.Solares");
                    opcionLugar = leer.nextInt();
                    switch (opcionLugar) {
                        case 1 -> {
                            for (Object t : objetos) {
                                if (t instanceof Casa) {
                                    System.out.println(t.toString());
                                }
                            }
                        }
                        case 2 -> {
                            for (Object t : objetos) {
                                if (t instanceof Edificio) {
                                    System.out.println(t.toString());
                                }
                            }
                        }
                        case 3 -> {
                            for (Object t : objetos) {
                                if (t instanceof Solar) {
                                    System.out.println(t.toString());
                                }
                            }
                        }
                    }
                }
                case 3 -> {
                    System.out.println("1. Casas\n2.Edificios\n3.Solares");
                    opcionLugar = leer.nextInt();
                    switch (opcionLugar) {
                        case 1 -> {
                            for (Object t : objetos) {
                                if (t instanceof Casa) {
                                    System.out.println(t.toString());
                                }
                            }
                            System.out.println("Ingrese la posicion que quiere modificar: ");
                            int pos = leer.nextInt();
                            System.out.println("Que quiere modificar?");
                            System.out.println("1. Numero de casa");
                            System.out.println("2. Numero de bloque");
                            System.out.println("3. Color");
                            System.out.println("4. Ancho");
                            System.out.println("5. Largo");
                            System.out.println("6. Numero de banios");
                            System.out.println("7. Numero de cuartos");
                            int escoger = leer.nextInt();
                            if (escoger == 1) {
                                System.out.println("Cual es el nuevo numero de casas? ");
                                int nuevo = leer.nextInt();
                                ((Casa) objetos.get(pos)).setNumeroCasa(nuevo);
                            } else if (escoger == 2) {
                                System.out.println("Cual es el nuevo numero de bloque? ");
                                int nuevo = leer.nextInt();
                                ((Casa) objetos.get(pos)).setNumeroBloque(nuevo);
                            } else if (escoger == 3) {
                                System.out.println("Cual es el nuevo color? ");
                                Color nuevo = JColorChooser.showDialog(null, "Ingrese color ", Color.red);
                                ((Casa) objetos.get(pos)).setColor(nuevo);
                            } else if (escoger == 4) {
                                System.out.println("Cual es el nuevo ancho? ");
                                int nuevo = leer.nextInt();
                                ((Casa) objetos.get(pos)).setAncho(nuevo);
                            } else if (escoger == 5) {
                                System.out.println("Cual es el nuevo numero de banios? ");
                                int nuevo = leer.nextInt();
                                ((Casa) objetos.get(pos)).setNumeroBanios(nuevo);
                            } else if (escoger == 6) {
                                System.out.println("Cual es el nuevo numero de cuartos? ");
                                int nuevo = leer.nextInt();
                                ((Casa) objetos.get(pos)).setNumeroCuartos(nuevo);
                            }

                        }
                        case 2 -> {
                            for (Object t : objetos) {
                                if (t instanceof Edificio) {
                                    System.out.println(t.toString());
                                }
                            }
                            System.out.println("Ingrese la posicion que quiere modificar: ");
                            int pos = leer.nextInt();
                            System.out.println("Que quiere modificar?");
                            System.out.println("1. Cantidad de locales");
                            System.out.println("2. Numero de pisos");
                            System.out.println("3. Direccion de referencia");
                            int escoger = leer.nextInt();
                            
                            if (escoger == 1) {
                                System.out.println("Cual es la nueva cantidad de locales?");
                                int nuevo = leer.nextInt();
                                ((Edificio)objetos.get(pos)).setCantidadLocales(nuevo);
                                
                            }else if(escoger ==2){
                                System.out.println("Cual es el nuevo numero de pisos?");
                                int nuevo = leer.nextInt();
                                ((Edificio)objetos.get(pos)).setNumeroPisos(nuevo);
                            }else if(escoger == 3){
                                System.out.println("Cual es la nueva direccion de referencia?");
                                String nuevo = leer.nextLine();
                                ((Edificio)objetos.get(pos)).setDirrecionReferencia(nuevo);
                            }
                            
                        }
                        case 3 -> {
                            for (Object t : objetos) {
                                if (t instanceof Solar) {
                                    System.out.println(t.toString());
                                }
                            }
                            System.out.println("Ingrese la posicion que quiere modificar: ");
                            int pos = leer.nextInt();
                            System.out.println("Que quiere modificar?");
                            System.out.println("1. Ancho");
                            System.out.println("2. Largo");
                            System.out.println("3. Duenio");
                            int escoger = leer.nextInt();
                            if(escoger == 1){
                                System.out.println("Cual es el nuevo ancho?");
                                int nuevo = leer.nextInt();
                                ((Solar)objetos.get(pos)).setAncho(nuevo);
                                
                            }else if(escoger == 2){
                                System.out.println("Cual es el nuevo largo?");
                                int nuevo = leer.nextInt();
                                ((Solar)objetos.get(pos)).setLargo(nuevo);
                                
                            }else if(escoger == 3){
                                System.out.println("Cual es el nuevo ancho?");
                                String nuevo = leer.nextLine();
                                ((Solar)objetos.get(pos)).setDuenio(nuevo);
                                
                            }
                            
                        }
                    }
                }
                case 4 -> {
                    System.out.println("1. Casas\n2.Edificios\n3.Solares");
                    opcionLugar = leer.nextInt();
                    switch (opcionLugar) {
                        case 1 -> {

                        }
                        case 2 -> {

                        }
                        case 3 -> {

                        }
                    }
                }
            }
        } while (salir);
    }

    public static boolean logOrSign(ArrayList<Usuario> user, boolean terminar) {
        boolean salir = true;
        Scanner leer = new Scanner(System.in);

        System.out.println("Desea log-in(1) o sign-up? (2)");
        int check = leer.nextInt();
        switch (check) {
            case 1 -> {
                System.out.println("Ingrese el user: ");
                String users = leer.nextLine();
                System.out.println("Ingrese la contrasenia: ");
                String contra = leer.nextLine();
                for (Usuario t : user) {
                    if (t.getUser().equalsIgnoreCase(users)) {
                        if (t.getContrasenia().equalsIgnoreCase(contra)) {
                            System.out.println("Bienvenido " + user);
                            terminar = true;
                        }
                    } else {
                        System.out.println("Error en usuario o contrasenia");
                        terminar = false;
                    }
                }
            }
            case 2 -> {
                System.out.println("Ingrese el nombre: ");
                leer.nextLine();
                String nombre = leer.nextLine();
                System.out.println("Ingrese la edad: ");
                int edad = leer.nextInt();
                System.out.println("Ingrese el user: ");
                leer.nextLine();
                String usuario = leer.nextLine();
                System.out.println("Ingrese la contrasenia: ");
                String contra = leer.nextLine();
                Usuario users = new Usuario(nombre, edad, usuario, contra);
                user.add(users);
                terminar = true;
            }
        }

        return terminar;
    }

}
