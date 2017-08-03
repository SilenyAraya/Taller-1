
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
                libros();
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
        Scanner nombre = new Scanner(System.in);
        String matrizNombre[][] = new String[3][3];
        for(int j=0; j<3; j++){
            for(int i=0; i<3; i++){
                System.out.print("Introduzca el nombre ("+j+", "+i+"): ");
                matrizNombre[j][i]=nombre.next();
              
            }    
        }
        //System.out.print(matrizNombre[j][i]+" ");
    }
   
    public static void libros() {
        System.out.println("\n1.Agregar libro\n2Libros Vendidos\n3 Libros Alquilados\n4.Salir\n\n"
                + "Seleccione una opción: ");
        int opcionLibro = ingresar.nextInt();
        switch (opcionLibro) {
            case 1:
                List listaLibros = new ArrayList();
             System.out.println("Escriba el nombre del libro");
             String libro= ingresar.next();
             listaLibros.add(libro);
             System.out.println("El libro fue agregado correctamente");
             System.out.println(listaLibros);
                break;
            case 2:
              
                break;
            case 3:
                
                break;
            case 4:
                menuPrincipal();
                break;
    }
        }

    public static void main(String[] args) {
        menuPrincipal();
        agregarNombres();
        libros();
    }
}

    