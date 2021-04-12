package Clases;
import java.util.*;

public class Main {
        static Scanner leer = new Scanner(System.in);
        static double a,b;
        static int op=0;
        
    public static void main(String[] args) throws Exception {
    
        do{
        	
                        System.out.println("\n Bienvenido \n \n Ingrese la Opcion que desea");
                        System.out.println("\n Menu \n \n 1.Sumar \n 2.Restar \n 3.Multiplicar \n 4.Dividir \n 5.Potencia \n 6.Raiz \n 7.Cerrar");
                        op = leer.nextInt();
                        
                        switch (op) {
                                case 1:
                                        System.out.println("Ingrese el Primer numero : ");
                                        a = leer.nextInt();
                                        System.out.println("Ingrese el segundo numero : ");
                                        b = leer.nextInt();
                                        System.out.println("el resultado de la suma es: "+ suma(a,b)+ "\n \n Que es la suma entre "+a + " y "+ b);
                                        break;
                                case 2:
                                        System.out.println("Ingrese el Primer numero : ");
                                        a = leer.nextInt();
                                        System.out.println("Ingrese el segundo numero : ");
                                        b = leer.nextInt();
                                        System.out.println("el resultado de la resta es: "+ resta(a,b)+ "\n \n Que es la resta entre "+a + " y "+ b);
                                        break;
                                case 3:
                                		System.out.println("Ingrese el Primer numero : ");
                                		a = leer.nextInt();
                                		System.out.println("Ingrese el segundo numero : ");
                                		b = leer.nextInt();
                                		System.out.println("el resultado de la multiplicacion es: "+ multiplicar(a,b)+ "\n \n Que es la multiplicacion entre "+a + " y "+ b);
                                		break;
                                case 4:
                            			System.out.println("Ingrese el Primer numero : ");
                            			a = leer.nextInt();
                            			System.out.println("Ingrese el segundo numero : ");
                            			b = leer.nextInt();
                            			System.out.println("el resultado de la division es: "+ division(a,b)+ "\n \n Que es la division entre "+a + " y "+ b);
                            			break;
                                case 5:
                        				System.out.println("Ingrese el Primer numero : ");
                        				a = leer.nextInt();
                        				System.out.println("Ingrese el segundo numero : ");
                        				b = leer.nextInt();
                        				System.out.println("el resultado de la potencia es: "+ potencia(a,b)+ "\n \n Que es la potencia entre "+a + " y "+ b);
                        				break;
                                case 6:
                						System.out.println("Ingrese un numero : ");
                						a = leer.nextInt();
                						System.out.println("el resultado de la raiz es: \n ");
                						System.out.println(Math.sqrt(a));
                						break; 
                                case 7:
            							System.exit(0);
            							break;
                        }
                                     
        }while(op!=7);  
            
    }
    
    static double suma(double a, double b){
            return a+b;
    }
    static double resta(double a, double b){
            return a-b;
    }
    static double multiplicar(double a, double b){
        return a*b;
    }
    static double division(double a, double b){
        return a/b;
    }
    static double potencia(double a, double b){
    	double x=1;
    	for (double i = 0; i < b; i++) {
    		x=x*a;
    	}
        return x;
    }

}