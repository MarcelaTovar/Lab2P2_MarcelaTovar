package lab2p2_marcelatovar;

import java.util.*;

public class Lab2P2_MarcelaTovar {

    public static void main(String[] args) {

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

                        }
                        case 2 -> {

                        }
                        case 3 -> {

                        }
                    }
                }
                case 2 -> {
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
                case 3 -> {
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
                String nombre = leer.nextLine();
                System.out.println("Ingrese la edad: ");
                int edad = leer.nextInt();
                System.out.println("Ingrese el user: ");
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
