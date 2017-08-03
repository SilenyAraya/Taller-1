
package laboratorios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Laboratorios {
    
    public static Scanner ingresar = new Scanner(System.in);
    

    public static void menuPrincipal() {
        
         while (true){
            System.out.println("\n1.Nombres\n2.Libros\n3.Salir\n\n"
                + "Seleccione una opción: ");
        int opcion = ingresar.nextInt();
        switch (opcion) {
            case 1:
                agregarNombres();
                break;
            case 2:
                
                break;
            case 3:
                break;
            default:
            System.out.println("Error! Digite opción válida!!");
            menuPrincipal();
            break;
        }      
    }   
}
    public static void agregarNombres() {
        String matriz[][] = new String[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int x = 0; x < matriz.length; x++) {
              System.out.println("Ingrese el nombre de la persona:");
              int nombre = ingresar.nextInt();

              } 
            }
            for (int y = 0; y < matriz[x].length; y++) {
                    System.out.println(matriz[x][y]);
                }

            
       

    }

    public static void main(String[] args) {
        menuPrincipal();
        agregarNombres();
    }
}

    