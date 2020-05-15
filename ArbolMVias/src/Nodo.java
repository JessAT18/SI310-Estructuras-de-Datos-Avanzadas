public class Nodo {

    public static int M = 3; //vias
    private int Elemento[];
    private Nodo Hijo[];
    private boolean Estado[];

    public Nodo() {
        Elemento = new int[M - 1];
        Estado = new boolean[M - 1];
        Hijo = new Nodo[M];
        for (int i = 0; i < M - 1; i++) {
            Estado[i] = false;
            Hijo[i] = null;
        }
        Hijo[M - 1] = null;
    }

    public int getElem(int i) {
        return Elemento[i - 1];
    }

    public Nodo getHijo(int i) {
        return Hijo[i - 1];
    }

    public boolean Ocupado(int i) {
        return Estado[i - 1];
    }

    public boolean Vacio(int i) {
        return !Estado[i - 1];
    }

    public void setElem(int x, int i) {
        Elemento[i - 1] = x;
        Estado[i - 1] = true;
    }

    public void setHijo(Nodo P, int i) {
        Hijo[i - 1] = P;
    }

    public void setVacio(int i) {
        Estado[i - 1] = false;
    }

    public int CantVacias() {
        int c = 0;
        for (int i = 0; i < Estado.length; i++) {
            if (Estado[i] == false) {
                c++;
            }
        }
        return c;
    }

    public int CantOcupados() {
        return (M - 1) - CantVacias();
    }

    public boolean Lleno() {
        return (CantVacias() == 0);
    }
    
    public int sumarN(){
        int sp = 0;
        for(int i=1; i<M; i++)
            sp = sp+getElem(i);
        return sp;
    }
    
    public int sumarNPares(){
        int sp = 0;
        for(int i=1; i<M; i++)
            if(getElem(i)%2==0)
                sp = sp+getElem(i);
        return sp;
    }
    //EJERCICIO 1
    public boolean verificarPrimo(int n, int i){
        if (n <= 2) 
            return (n == 2); 
        if (n % i == 0) 
            return false; 
        if (i * i > n) 
            return true; 
        return verificarPrimo(n, i + 1); 
    }
    
    public int CantPrimos(){
        int c = 0, j=2;
        for (int i=1; i<M; i++) {
            if (verificarPrimo(getElem(i), j))
                c++;
        }
        return c;
    }
    //FIN EJERCICIO 1
    
    //EJERCICIO 3
    public int getElemMayor(){
        int may=0;
        for (int i=1; i<M; i++) {
            if (getElem(i)>may)
                may = getElem(i);
        }
        return may;
    }
    //FIN EJERCICIO 3
    
    //EJERCICIO 4
    public int CantElemMayorX(int x){
        int c = 0;
        for (int i=1; i<M; i++) {
            if (getElem(i)>x)
                c++;
        }
        return c;
    }
    //FIN EJERCICIO 4
} //end class Nodo