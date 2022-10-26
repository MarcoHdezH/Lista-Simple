package Ligadas;

import java.util.Scanner;


public class Lista {

    private static final String Informacion = null;
	private Nodo InicioLista, FinLista, InicioLista2, FinLista2;

    //Constructor
    public Lista() {
        InicioLista = null;
        FinLista = null;
        InicioLista2 = null;
        FinLista2 = null;
    }

    //Met�do Agregar Inicio.
    public void Insertar_Inicio(int dato) {
        InicioLista = new Nodo(dato, InicioLista);
        if (FinLista == null) {
            FinLista = InicioLista;
        }
    }    

    //Met�do Agregar Final
    public void Insertar_Final(int dato) {
        if (!ListaVacia()) {
            FinLista.Siguiente = new Nodo(dato);
            FinLista = FinLista.Siguiente;
        } else {
            InicioLista = FinLista = new Nodo(dato);
        }
    } 

    //M�todo Agregar a la izquierda
    public void Insertar_Izquierda(int dato, int n) {
        Nodo nuevo = new Nodo(dato);
        
        if (ListaVacia()) {
            InicioLista = FinLista = new Nodo(dato);
        } else {
            if (InicioLista.Siguiente == null) {
                FinLista.Siguiente = new Nodo(dato);
                FinLista = FinLista.Siguiente;
            } else {
            	Nodo aux=InicioLista;
              	while(aux.Siguiente.Informacion != n) {         		 
              		aux=aux.Siguiente;
              	  }
              	if(Buscador(n)) {
          		    Nodo siguiente = aux.Siguiente;
                  	    aux.Siguiente = nuevo;
                  	    nuevo.Siguiente = siguiente;
          		}
            }
        }
    }

    //M�todo agregar derecha
    public void Insertar_Derecha(int dato, int n) {
        Nodo nuevo = new Nodo(dato);;

        if (ListaVacia()) {
            InicioLista = FinLista = new Nodo(dato);
        } else {
            if (InicioLista.Siguiente == null) {
                FinLista.Siguiente = new Nodo(dato);
                FinLista = FinLista.Siguiente;
            } else {
            	Nodo aux = InicioLista;
                while (aux.Informacion != n) {
                    aux = aux.Siguiente;
                }
                if (Buscador(n)) {
                    Nodo siguiente = aux.Siguiente;
                    aux.Siguiente = nuevo;
                    nuevo.Siguiente = siguiente;
                }
            }
        }
    }

    //M�todo agregar por posici�n
    public void Insertar_Posicion(int posicion, int dato) {
        posicion--;
        Nodo nuevo = new Nodo(dato);;
        if (posicion >= 0 && posicion <= TamanoLista()) {
            if (posicion == 0) {
                Insertar_Inicio(dato);
            } else {
            	Nodo aux=InicioLista;
                for(int i=0;i<posicion-1;i++){
                    aux=aux.Siguiente;
                }
          		Nodo siguiente = aux.Siguiente;
                  	aux.Siguiente = nuevo;
                  	nuevo.Siguiente = siguiente;
              }
      }else{
              System.out.println("Posicion Inexistente");
          }
    }

    //Mostrar Lista
    public void MostrarLista() {
        Nodo Recorrer = InicioLista;
        if (!ListaVacia()) {
            while (Recorrer != null) {
                System.out.print("[" + Recorrer.Informacion + "]->");
                Recorrer = Recorrer.Siguiente;
            }
            System.out.println();
        } else {
            System.out.println("La Lista esta vacia.");
            
        }

    }

    //Verificar Lista-Vacia
    public boolean ListaVacia() {
        if (InicioLista == null) {
            return true;
        } else {
            return false;
        }
    }

    //Verificar Tama�o Lista
    public int TamanoLista() {
        Nodo Recorrer = InicioLista;
        int Tamano = 0;
        if (!ListaVacia()) {
            while (Recorrer != null) {
                Tamano++;
                Recorrer = Recorrer.Siguiente;
            }
        }
        return Tamano;
    }

    public boolean Buscador(int dato) {
        Nodo Recorrer = InicioLista;
        boolean esta = false;
        if (!ListaVacia()) {
            while (Recorrer != null) {
                if (dato == Recorrer.Informacion) {
                    esta = true;
                }
                Recorrer = Recorrer.Siguiente;
            }
        } else {
            esta = false;
        }
        return esta;
    }
    
    //Met�do Borrar Inicio.
    public void Borrar_Inicio() {
        if (ListaVacia()) {
            System.out.println("La lista esta vacia");
        }else{
        System.out.println("El Dato Borrado es : " + InicioLista.Informacion);
        InicioLista = InicioLista.Siguiente;
        }        
    }
    
    //Met�do Borrar Final
    public void Borrar_Final() {
        if (!ListaVacia()) {
            Nodo aux;
            aux = InicioLista;
            while (aux.Siguiente != FinLista) {
                aux = aux.Siguiente;
            }
            System.out.println("El dato Borrado es  " + aux.Siguiente.Informacion);
            aux.Siguiente = null;
            FinLista = aux;

        } else {
            System.out.println("La lista esta vacia");
        }
    }
    
       //M�todo Borrar a la izquierda
    public void Borra_Izquierda() {

        int n;
        if (ListaVacia()) {
            System.out.println("La lista esta vacia");
        } else {

            System.out.println("Proporcione el nodo al que se desea Borrar dato:");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if (InicioLista.Informacion == n) {
                System.out.println("No hay nada que borrar");
            } else {

                Nodo aux = InicioLista;
                Nodo borrar;
                Nodo anterior;
                do {
                    borrar = aux;
                    aux = aux.Siguiente;
                } while (aux.Informacion != n);
                System.out.println("El nodo a borrar es " + borrar.Informacion);
                aux = InicioLista;
                if (borrar == InicioLista) {
                    InicioLista = borrar.Siguiente;
                } else {
                    do {
                        anterior = aux;
                        aux = aux.Siguiente;
                    } while (aux.Informacion != borrar.Informacion);
                    System.out.println("El nodo anterior es " + anterior.Informacion);
                    anterior.Siguiente = borrar.Siguiente;
                }

            }

        }
    }

    //M�todo Borrar a la derecha
    public void Borra_Derecha() {

        int n;
        if (ListaVacia()) {
            System.out.println("La lista esta vacia");
        } else {

            System.out.println("Proporcione el nodo al que se desea Borrar dato:");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if (FinLista.Informacion == n) {
                System.out.println("No hay nada que borrar");
            } else {

                Nodo aux = InicioLista;
                Nodo borrar = InicioLista.Siguiente;
                Nodo anterior;
                while (aux.Informacion != n) {

                    aux = aux.Siguiente;
                    borrar = aux.Siguiente;
                }
                System.out.println("El nodo a borrar es " + borrar.Informacion);
                aux = InicioLista;

                do {
                    anterior = aux;
                    aux = aux.Siguiente;

                } while (aux.Informacion != borrar.Informacion);
                System.out.println("El nodo anterior es " + anterior.Informacion);
                anterior.Siguiente = borrar.Siguiente;

            }

        }
    }
    
        //Met�do Borrar I-esimaposicion
    public void Borrar_Posicion(int pos) {
        if (!ListaVacia()) {
            int cont = 1;
            Nodo aux;
            aux = InicioLista;
            while (aux != FinLista && cont != pos) {
                cont++;
                aux = aux.Siguiente;
            }
            System.out.println("El dato Borrado es  " + aux.Informacion);
            Nodo anterior = InicioLista;
            if (aux == InicioLista) {
                InicioLista = InicioLista.Siguiente;
            } else {
                while (anterior.Siguiente != aux) {
                    anterior = anterior.Siguiente;
                }
                anterior.Siguiente = aux.Siguiente;
            }

        } else {
            System.out.println("La lista esta vacia");
        }
    }
    
    //Met�do Borrar Con Informacion X
    public void Borrar_Informacion(int num) {
        if (Buscador(num)) {

            if (!ListaVacia()) {
                Nodo aux;
                aux = InicioLista;
                while (aux != FinLista && aux.Informacion != num) {
                    aux = aux.Siguiente;
                }
                System.out.println("El dato Borrado es  " + aux.Informacion);
                Nodo anterior = InicioLista;

                if (aux == InicioLista) {
                    InicioLista = InicioLista.Siguiente;
                } else {
                    while (anterior.Siguiente != aux) {
                        anterior = anterior.Siguiente;
                    }
                    anterior.Siguiente = aux.Siguiente;
                }

            } else {
                System.out.println("La lista esta vacia");
            }
        } else {
            System.out.println("El dato no existe");
        }
    }
    
    //Met�do Borrar Con Informacion (repetidos )
    public void Borrar_InformacionX(int num) {
        if (Buscador(num)) {

            if (!ListaVacia()) {
                Nodo aux;
                aux = InicioLista;
                while (aux != FinLista) {
                    if (aux.Informacion == num) {
                        System.out.println("El dato Borrado es  " + aux.Informacion);
                        Nodo anterior = InicioLista;

                        if (aux == InicioLista) {
                            InicioLista = InicioLista.Siguiente;
                        } else {
                            while (anterior.Siguiente != aux) {
                                anterior = anterior.Siguiente;
                            }
                            anterior.Siguiente = aux.Siguiente;
                        }
                    }
                    aux = aux.Siguiente;
                }

            } else {
                System.out.println("La lista esta vacia");
            }
        } else {
            System.out.println("El dato no existe");
        }
    }
    
    public int[] Lista_Vector(){
        int vector[]=new int[100];
        Nodo Recorrer=InicioLista;
        int Tamano=0;
        if(!ListaVacia()){
            while(Recorrer!=null){
                 vector[Tamano]=Recorrer.Informacion;
                 Tamano++;
                 Recorrer=Recorrer.Siguiente;
                 
             }
        }
        return vector; 
    }
    
    //Invertir
    public void Invertir() {
    	if (ListaVacia()) {
            System.out.println("La lista esta vacia, no hay elementos a invertir.");
        }else {
        	FinLista.Siguiente = new Nodo(0);
            FinLista = FinLista.Siguiente;
        	while (InicioLista.Siguiente != null) {
        		InicioLista2=new Nodo(InicioLista.Informacion,InicioLista2);
        			FinLista2 = InicioLista2;
        		InicioLista=InicioLista.Siguiente;
        		}
        	}
        }
    
    public void Borrar_Inicio2() {
        if (ListaVacia()) {
            System.out.println("La lista esta vacia");
        }else{
        //System.out.println("El Dato Borrado es : " + InicioLista.Informacion);
        InicioLista = InicioLista.Siguiente;
        }        
    }
    
    
  //Mostrar Lista
    public void MostrarLista2() {
        Nodo Recorrer = InicioLista2;
        if (!ListaVacia()) {
            while (Recorrer != null) {
                System.out.print("[" + Recorrer.Informacion + "]->");
                Recorrer = Recorrer.Siguiente;
            }
            System.out.println();
        } else {
            System.out.println("La Lista esta vacia");
        }

    }
    
    public void Ordenar(int tam){
        Nodo Recorrer = InicioLista;
        int i = 0;
        tam = TamanoLista();
        int temp = 0;
        if (!ListaVacia()) {
            for (int j = 0; j < tam; j++) {
                for(i = 0; i < (tam*tam); i++){
                    while (Recorrer.Siguiente != null) {
                        if (Recorrer.Informacion > Recorrer.Siguiente.Informacion) {
                            temp = Recorrer.Informacion;
                            Recorrer.Informacion = Recorrer.Siguiente.Informacion;
                            Recorrer.Siguiente.Informacion = temp;
                        }
                        Recorrer = Recorrer.Siguiente;
                    }
                }
                Recorrer = InicioLista;    
            }
        }
    }
    public Lista Copiar(){
        Nodo Recorrer = InicioLista;
        Lista nueva = new Lista();
        int i = 0;
        int tam = TamanoLista();
        //System.out.println(tam);
        int temp = 0;
        if (!ListaVacia()) {
            for(i = 0; i <= tam; i++){
                while (Recorrer != null) {
                    nueva.Insertar_Final(Recorrer.Informacion);
                    Recorrer = Recorrer.Siguiente;
                }
            }
        }
        return nueva;
    }    
}
