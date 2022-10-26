package Ligadas;

import java.util.LinkedList;
import java.util.Scanner;

public class ListLigadas {

	public static void main(String[] args) {
        int opc = 0, dato = 0, n;
        int vector[]=new int[100];
        Lista lista = new Lista();
        Lista lista2 = new Lista();
        Lista lista3 = new Lista();
        do{
            System.out.println("Menu de opciones:\n"
                    + "1)Insertar un elemento .\n"
                    + "2)Borrar un elemento .\n"
                    + "3)Mostrar los elementos de una lista\n"
                    + "4)Invertir\n"
                    + "5)Parametros de lista\n"
                    + "6)Salir.\n");
            Scanner sc = new Scanner(System.in);
                        opc = sc.nextInt();

            switch (opc) {
                case 1:
                    int op = 0;
                    do {

                        System.out.println("Menu de opciones:\n"
                                + "1)Agregar elemento al inicio de la lista.\n"
                                + "2)Agregar elemento al final de la lista.\n"
                                + "3)Agregar elemento a la izquierda de...\n"
                                + "4)Agregar elemento a la derecha de...\n"
                                + "5)Agregar elemento en la i-esima posici�n.\n"
                                + "6)Agregar elemento de forma ordenada ascendente.\n"
                                + "7)Salir al Men� principal.\n");
                        op = sc.nextInt();

                        switch (op) {

                            case 1:
                                System.out.println("Proporcione dato a Ingresar en la lista:");
                                dato = sc.nextInt();
                                lista.Insertar_Inicio(dato);
                                break;
                            case 2:
                                System.out.println("Proporcione dato a Ingresar en la lista:");
                                dato = sc.nextInt();
                                lista.Insertar_Final(dato);
                                break;
                            case 3:
                                System.out.println("Proporcione dato a Ingresar en la lista:");
                                dato = sc.nextInt();
                                System.out.println("Ingrese elemento de referencia");
                                n= sc.nextInt();
                                lista.Insertar_Izquierda(dato,n);
                                break;
                            case 4:
                                System.out.println("Proporcione dato a Ingresar en la lista:");
                                System.out.println("Ingrese elemento de referencia");
                                n= sc.nextInt();
                                lista.Insertar_Derecha(dato,n);
                                break;
                            case 5:
                                System.out.println("Ingrese dato");
                                dato = sc.nextInt();
                                System.out.println("Ingrese posicion");
                                int pos = sc.nextInt();
                                lista.Insertar_Posicion(pos, dato);
                                break;
                            case 6:
                            	int i=0,aux,tam;
                                System.out.println("Ingrese dato a  a�adir a la lista");
                                dato=sc.nextInt();
                                if(!lista.ListaVacia()){
                                    vector=lista.Lista_Vector();
                                    vector[lista.TamanoLista()]=dato;
                                    tam=lista.TamanoLista()+1;
                                    for(i=0;i<tam;i++){
                                        for(int j=0;j<tam-1;j++){
                                            if(vector[j]>vector[j+1]){
                                                aux=vector[j];
                                                vector[j]=vector[j+1];
                                                vector[j+1]=aux;
                                            }
                                        }
                                    }
                                    i=0;
                                    do{
                                        if(vector[i]!=dato){
                                        i++;
                                        }
                                    }while(vector[i]!=dato);
                                    lista.Insertar_Posicion(i+1, dato);
                                }else{
                                    lista.Insertar_Inicio(dato);
                                }
                                break;
                            case 7:
                                System.out.println("Salida.....");
                                break;
                            default:
                                System.out.println("Opcion Invalida");
                        }
                    } while (op != 7);
                    break;

                case 2:
                    do {

                        System.out.println("Menu de opciones:\n"
                                + "1)Eliminar elemento al inicio de la lista.\n"
                                + "2)Eliminar elemento al final de la lista.\n"
                                + "3)Eliminar elemento a la izquierda de X.\n"
                                + "4)Eliminar elemento a la derecha de X.\n"
                                + "5)Eliminar elemento en la i-esima posici�n.\n"
                                + "6)Eliminar elemento X.\n"
                                + "7)Eliminar todos los elementos con informacion X. \n"
                                + "8)Salir al Men� principal.\n");                      
                        op = sc.nextInt();

                        switch (op) {

                            case 1:
                                lista.Borrar_Inicio();
                                break;
                            case 2:
                                lista.Borrar_Final();
                                break;
                            case 3:
                                lista.Borra_Izquierda();
                                break;
                            case 4:
                                lista.Borra_Derecha();
                                break;
                            case 5:
                                System.out.println("Ingrese posicion a borrar");
                                int pos = sc.nextInt();
                                lista.Borrar_Posicion(pos);
                                break;
                            case 6:
                                System.out.println("Ingrese dato a borrar");
                                int num = sc.nextInt();
                                lista.Borrar_Informacion(num);
                                break;
                            case 7:
                                System.out.println("Ingrese dato a borrar");
                                int num2 = sc.nextInt();
                                lista.Borrar_InformacionX(num2);
                                break;
                            case 8:
                                System.out.println("Salida.....");
                                break;
                            default:
                                System.out.println("Opcion Invalida");
                        }
                    } while (op != 8);
                    break;
                case 3:
                	do {
                		System.out.println("Menu de opciones:\n"
                                + "1)Imprimir lista 1 (original) \n"
                                + "2)Imprimir lista invertida.\n"
                                + "3)Imprimir lista 2. \n"
                                + "4)Imprimir lista 3. \n"
                                + "5)Regresar al menu principal.\n");                    
                        op = sc.nextInt();
                        
                        switch (op) {
                        
                        case 1:
                        	System.out.println("\n");
                        	lista.MostrarLista();
                        	System.out.println("Su lista actual contiene el siguiente numero de elementos: "+ lista.TamanoLista());
                        	System.out.println("\n");
                        	break;
                        	
                        case 2:
                        	System.out.println("Su lista invertida es: ");
                        	lista.Invertir();
                        	lista.MostrarLista2();
                        	System.out.println("\n");
                        	lista.Borrar_Inicio2();
                        	break;
                        	
                        case 3:
                            if (!lista2.ListaVacia()) {
                                System.out.println("Lista 2:");
                                lista2.MostrarLista();
                            }else{
                                System.out.println("Lista vacía");
                            }
                        	break;
                        	
                        case 4:
                            if (!lista3.ListaVacia()) {
                                System.out.println("Lista 3:");
                                lista3.MostrarLista();
                            }else{
                                System.out.println("Lista vacía");
                            }
                        	break;
                        case 5:
                        	break;
                        default:
                            System.out.println("Opcion Invalida");
                        }
                	} while (op!=5);

                	break;
                case 4:
                    lista.Invertir();
                    lista.MostrarLista2();
                break;
                case 5:
                    int x;
                    int i=0,aux,tam;
                    System.out.println("Tomaremos la primera lista y necesitamos crear una segunda lista. \nPor favor indique cuantos datos tendra la segunda lista:");
                    x = sc.nextInt();
                    lista3 = lista.Copiar();
                    System.out.println("Ingrese los datos de la segunda lista, uno por uno.");
                    lista2 = new Lista();
                    for (i = 0; i < x; i++) {
                        dato = sc.nextInt();
                        lista3.Insertar_Final(dato);
                        lista2.Insertar_Final(dato);   
                    }
                    System.out.println("Lista 1:");
                    lista.MostrarLista();
                    System.out.println("Lista 2:");
                    lista2.MostrarLista();
                    int tamtemp = lista3.TamanoLista();
                    lista3.Ordenar(tamtemp);
                    System.out.println("Lista 3:");
                    lista3.MostrarLista();
                	break;
                case 6:
                	System.out.println("Adios.");
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        }while (opc != 6);

    }

}
