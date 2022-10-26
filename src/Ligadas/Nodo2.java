package Ligadas;

public class Nodo2 {

	public int Informacion2;
    public Nodo Siguiente2;
    
    public Nodo2(int Valor){
        Informacion2=Valor;
        Siguiente2=null;
    } 
    
    public Nodo2(int Valor, Nodo nodo){
        Informacion2=Valor;
        Siguiente2=nodo;
    }
    
    public Nodo2(){
        Informacion2=0;
        Siguiente2=null;
    }

}
