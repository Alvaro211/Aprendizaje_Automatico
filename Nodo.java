import javax.xml.namespace.QName;

public class Nodo {
    private char dato;
    private int valor;
    private Nodo izq, der;

    public Nodo(int valor, char dato){
        this.valor = valor;
        this.dato = dato;
        this.izq = null;
        this.der = null;
    }

    public int getValor(){
        return valor;
    }

    public char getDato(){
        return dato;
    }

    public Nodo getDer(){
        return der;
    }

    public Nodo getIzq(){
        return izq;
    }

    public void setDer(Nodo nodo){
        this.der = nodo;
    }

    public void setIzq(Nodo nodo){
        this.izq = nodo;
    }
}
