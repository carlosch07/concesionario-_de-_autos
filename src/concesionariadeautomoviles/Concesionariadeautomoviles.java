
package concesionariadeautomoviles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Concesionariadeautomoviles {

    public static void main(String[] args) {
       
        Scanner sn = new Scanner(System.in);
        boolean salir = false; 
        int opcion;
        while (!salir) {
        
        
        System.out.println("1.- SELECCIONAR AUTOMOVIL");
        System.out.println("2.- SALIR");
        
        try{
        
        System.out.println("seleccione una opcion");
        opcion = sn.nextInt();
        switch(opcion){
            case 1:
                System.out.println("01.- sedan economico");
                    break;
            case 2:
                System.out.println("02.- sedan");       
                    break;
            case 3:
                System.out.println("03.-deportivo");
                    break;
            case 4:
                System.out.println("04.-hibrido");
                break;
            case 5:
                System.out.println("05.- coupe");
                    break;
            case 6:
                System.out.println("06.- coupe deportivo");
                    break;
            case 7:
                System.out.println("07.- compacto");
                    break;
            case 8:
                System.out.println("08.- hatchback");
                    break;
            case 9:
                System.out.println("09.- economico version rally");
                    break; 
             case 10: 
                 System.out.println("10.- regresar al menu principal");
                    break;
             default:
                 System.out.println("las opciones son del 1 al 10");
        }
     
        }catch(InputMismatchException e){
            System.out.println("debes un numero");
            sn.next();
        }
    }
        System.out.println("fin del menu"); 
}
    
}
