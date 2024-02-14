
package ipc1_tarea2_202202055;

import java.util.Scanner;
public class IPC1_Tarea2_202202055 {

   
    public static void main(String[] args) {
        metodos proceso =new metodos();
        Scanner entrada = new Scanner(System.in);
        int n1, n2, resultado , opcion;
        boolean op = true;
        while(op){
            System.out.println("=============================");
            System.out.println("Menu");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion");
            opcion = entrada.nextInt();
            
            if (opcion == 5){
                System.out.println("Fin de proceso: ");
                break;
            }else{
                switch (opcion){
                    case 1:
                        System.out.println("Ingrese un numero: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingrese un numero: ");
                        n2 = entrada.nextInt();
                        resultado = proceso.sumar(n1 ,n2);
                        System.out.println("La suma es " + resultado);
                        break;
                    case 2:
                        System.out.println("Ingrese un numero: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingrese un numero: ");
                        n2 = entrada.nextInt();
                        resultado = proceso.restar(n1 ,n2);
                        System.out.println("La resta es " + resultado);
                        break;
                    case 3:
                        System.out.println("Ingrese un numero: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingrese un numero: ");
                        n2 = entrada.nextInt();
                        resultado = proceso.multiplicar(n1 ,n2);
                        System.out.println("La multiplicacion es " + resultado);
                        break;   
                    case 4:
                        System.out.println("Ingrese un numero: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingrese un numero: ");
                        n2 = entrada.nextInt();
                        resultado = proceso.dividir(n1 ,n2);
                        System.out.println("La dividion es " + resultado);
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }
        }
    }        
}
