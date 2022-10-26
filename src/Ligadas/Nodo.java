package Ligadas;

public class Nodo {

	public int Informacion;
    public Nodo Siguiente;
    
    public Nodo(int Valor){
        Informacion=Valor;
        Siguiente=null;
    } 
    
    public Nodo(int Valor, Nodo nodo){
        Informacion=Valor;
        Siguiente=nodo;
    }
    
    public Nodo(){
        Informacion=0;
        Siguiente=null;
    }
}
