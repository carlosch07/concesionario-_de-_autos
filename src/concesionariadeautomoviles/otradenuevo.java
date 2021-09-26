/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionariadeautomoviles;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class otradenuevo {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
       
        
        System.out.println("----------------");
        System.out.println("CONCESIONARIO DE AUTOS");
        System.out.println("-MENU PRINCIPAL");
        System.out.println("----------------");
        System.out.println("1.- seleccionar automovil\n2.-salir");
        System.out.println("ingrese la opcion que desea ejecutar");
        
        int seleccion = teclado.nextInt();
        
        switch(seleccion) {
        
            case 1: System.out.println("--------------");
                System.out.println("CONSESIONARIO DE AUTOS");
                System.out.println("-SELECCION DE GAMA DE VEHICULO");
                System.out.println("----------------");
                System.out.println("01.- SEDAN ECONOMICO\n02.- SEDAN\n03.- DEPORTIVO");
                System.out.println("04.- HIBRIDO\n05.- COUPE\n06.- COUPE DEPORTIVO");
                System.out.println("07.- COMPACTO\n08.- HATCHBACK\n09.- ECONOMICO VERSION RALLY");
                System.out.println("10.- REGRESAR AL MENU ");
                break;
        }
                System.out.println("ingrese gama de vehiculo"); 
                int tipo = teclado.nextByte();
                
                switch(tipo) {
                    
                    case 1: System.out.println("------------------");
                        System.out.println("CONCESIONARIO DE AUTOS");
                        System.out.println("-SELECCION DE GAMA DE VEHICULO-");
                        System.out.println("-------------------");
                        System.out.println("HA SELECCIONADO LA GAMA: SEDAN ECONOMICO");
                        System.out.println("¿DESEA AGREGAR AMENIDADES? (S/N): ");
                    break;
                    
                    case 2: System.out.println("------------------");
                        System.out.println("CONCESIONARIO DE AUTOS");
                        System.out.println("-SELECCION DE GAMA DE VEHICULO-");
                        System.out.println("-------------------");
                        System.out.println("HA SELECCIONADO LA GAMA: SEDAN");
                        System.out.println("¿DESEA AGREGAR AMENIDADES? (S/N): ");
                    break;
                    
                    case 3: System.out.println("------------------");
                        System.out.println("CONCESIONARIO DE AUTOS");
                        System.out.println("-SELECCION DE GAMA DE VEHICULO-");
                        System.out.println("-------------------");
                        System.out.println("HA SELECCIONADO LA GAMA: DEPORTIVO");
                        System.out.println("¿DESEA AGREGAR AMENIDADES? (S/N): ");
                    break;
                
                    case 4: System.out.println("------------------");
                        System.out.println("CONCESIONARIO DE AUTOS");
                        System.out.println("-SELECCION DE GAMA DE VEHICULO-");
                        System.out.println("-------------------");
                        System.out.println("HA SELECCIONADO LA GAMA: HIBRIDO");
                        System.out.println("¿DESEA AGREGAR AMENIDADES? (S/N): ");
                    break;
                    
                    case 5: System.out.println("------------------");
                        System.out.println("CONCESIONARIO DE AUTOS");
                        System.out.println("-SELECCION DE GAMA DE VEHICULO-");
                        System.out.println("-------------------");
                        System.out.println("HA SELECCIONADO LA GAMA: COUPE");
                        System.out.println("¿DESEA AGREGAR AMENIDADES? (S/N): ");
                    break;
                    
                    case 6: System.out.println("------------------");
                        System.out.println("CONCESIONARIO DE AUTOS");
                        System.out.println("-SELECCION DE GAMA DE VEHICULO-");
                        System.out.println("-------------------");
                        System.out.println("HA SELECCIONADO LA GAMA: COUPE DESPORTIVO");
                        System.out.println("¿DESEA AGREGAR AMENIDADES? (S/N): ");
                    break;
                    
                    case 7: System.out.println("------------------");
                        System.out.println("CONCESIONARIO DE AUTOS");
                        System.out.println("-SELECCION DE GAMA DE VEHICULO-");
                        System.out.println("-------------------");
                        System.out.println("HA SELECCIONADO LA GAMA: COMPACTO");
                        System.out.println("¿DESEA AGREGAR AMENIDADES? (S/N): ");
                    break;
                    
                    case 8: System.out.println("------------------");
                        System.out.println("CONCESIONARIO DE AUTOS");
                        System.out.println("-SELECCION DE GAMA DE VEHICULO-");
                        System.out.println("-------------------");
                        System.out.println("HA SELECCIONADO LA GAMA: HATCHBACK");
                        System.out.println("¿DESEA AGREGAR AMENIDADES? (S/N): ");
                    break;
                    
                    case 9: System.out.println("------------------");
                        System.out.println("CONCESIONARIO DE AUTOS");
                        System.out.println("-SELECCION DE GAMA DE VEHICULO-");
                        System.out.println("-------------------");
                        System.out.println("HA SELECCIONADO LA GAMA: ECONOMICO VERSION RALLY");
                        System.out.println("¿DESEA AGREGAR AMENIDADES? (S/N): ");
                    break;
                    
    }
}
}