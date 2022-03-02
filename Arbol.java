public class Arbol{
    private Nodo raiz;
    private int tanamyo;

    public void crear(){
        raiz = null;
        tamanyo = 0;
    }

    public void insertar(int valor, char dato){
        if(this.raiz == null){
            this.raiz = new Nodo(valor, dato);
        } else{
            insertarAux(raiz, valor, dato);
        }

        this.tamanyo++;
    }

    private void insertarAux(Nodo raiz, int valor, char dato){
        if(menor(valor, raiz.getValor())){

        } else{

        }
    }
}