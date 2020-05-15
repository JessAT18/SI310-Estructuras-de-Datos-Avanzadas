
import javax.swing.JTextArea;

public class ArbolM {

    private Nodo raiz;

    public ArbolM() {
        raiz = null;
    }

    private boolean esHoja(Nodo P) {
        for (int i = 1; i <= P.M; i++) {
            if (P.getHijo(i) != null) {
                return false;
            }
        }
        return true;
    }

    private int getHijoDesc(Nodo P, int x) {
        int i = 1;
        while (i < P.M) {
            if (x < P.getElem(i)) {
                return i;
            }
            if (x == P.getElem(i)) {
                return -1;
            }
            i++;
        }
        return P.M;
    }

    private void Recorrer(Nodo P, int i) {
        int num1 = P.getElem(i);
        int num2 = 0;
        int c = P.CantOcupados();
        while (i <= c) {
            if (P.Ocupado(i + 1)) {
                num2 = P.getElem(i + 1);
            }
            P.setElem(num1, i + 1);
            num1 = num2;
            i++;
        }
    }

    private void InsertaOrd(Nodo P, int x) {
        for (int i = 1; i < P.M; i++) {
            if (P.Vacio(i)) {
                P.setElem(x, i);
                return;
            } else {
                if (x == P.getElem(i)) {
                    return;
                } else {
                    if (x < P.getElem(i)) {
                        Recorrer(P, i);
                        P.setElem(x, i);
                        return;
                    }
                }
            }
        }
    }

    public void Insertar(int x) {
        if (raiz == null) {
            raiz = new Nodo();
            raiz.setElem(x, 1);
        } else {
            Nodo P = raiz;
            Nodo AP = null;
            int i = 0;
            while (P != null) {
                AP = P;
                if (!P.Lleno()) {
                    InsertaOrd(P, x);
                    return;
                }
                i = getHijoDesc(P, x);
                if (i == -1) {
                    return; // x esta en el arbol 
                }
                P = P.getHijo(i);
            }
            Nodo Q = new Nodo();
            Q.setElem(x, 1);
            AP.setHijo(Q, i);
        }
    }

    private void PreOrden(Nodo P, JTextArea jta) {
        if (P == null) {
            return;
        } else {
            if (esHoja(P)) {
                int i = 1; //muestra todos los elementos de nodo P 
                while (i <= P.CantOcupados()) {
                    jta.append(String.valueOf(P.getElem(i) + "  "));
                    i++;
                }
            } else {
                for (int i = 1; i <= P.M - 1; i++) {
                    jta.append(String.valueOf(P.getElem(i) + "  "));
                    PreOrden(P.getHijo(i), jta);
                }
                PreOrden(P.getHijo(P.M), jta);
            }
        }
    }

    public void PreOrden(JTextArea ta) {
        PreOrden(raiz, ta);
    }
    
    private void InOrden(Nodo P, JTextArea jta) {
        if (P == null) {
            return;
        } else {
            if (esHoja(P)) {
                int i = 1; //muestra todos los elementos de nodo P 
                while (i <= P.CantOcupados()) {
                    jta.append(String.valueOf(P.getElem(i) + "  "));
                    i++;
                }
            } else {
                for (int i = 1; i <= P.M - 1; i++) {
                    InOrden(P.getHijo(i), jta);
                    jta.append(String.valueOf(P.getElem(i) + "  "));
                }
                InOrden(P.getHijo(P.M), jta);
            }
        }
    }

    public void InOrden(JTextArea ta) {
        InOrden(raiz, ta);
    }
    
    private int sumarElementos(Nodo R){
        if(R==null)
            return 0;
        else{
            if(esHoja(R))
                return R.sumarN();
            else{
                int h=0;
                for(int i=1; i<=R.M; i++){
                    h = h+sumarElementos(R.getHijo(i));
                }
                return h+R.sumarN();
            }
        }
    }
    
    public int sumarElementos(){
        return sumarElementos(raiz);
    }
    
    private int CantNodos(Nodo R){
        if(R==null)
            return 0;
        else{
            if(esHoja(R))
                return 1;
            else{
                int h=0;
                for(int i=1; i<=R.M; i++){
                    h = h+CantNodos(R.getHijo(i));
                }
                return h+1; //Cantidad de nodos de los hijos y contamos el nodo padre
            }
        }
    }
    
    public int CantNodos(){
        return CantNodos(raiz);
    }
    
    private int CantElementos(Nodo R){
        if(R==null)
            return 0;
        else{
            if(esHoja(R))
                return R.CantOcupados();
            else{
                int h=0;
                for(int i=1; i<=R.M; i++){
                    h = h+CantElementos(R.getHijo(i));
                }
                return h+R.CantOcupados();
            }
        }
    }
    
    public int CantElementos(){
        return CantElementos(raiz);
    }
    
    private int Altura(Nodo R){
        if(R==null)
            return 0;
        else{
            if(esHoja(R))
                return 1;
            else{
                int max = 0;
                for(int i=1; i<=R.M; i++){
                    int h = Altura(R.getHijo(i));
                    if(max<h)
                        max = h;
                }
                return max+1;
            }
        }
    }
    
    public int Altura(){
        return Altura(raiz);
    }
    
    private int sumarElementosPares(Nodo R){
        if(R==null)
            return 0;
        else{
            if(esHoja(R))
                return R.sumarNPares();
            else{
                int h=0;
                for(int i=1; i<=R.M; i++){
                    h = h+sumarElementosPares(R.getHijo(i));
                }
                return h+R.sumarNPares();
            }
        }
    }
    
    public int sumarElementosPares(){
        return sumarElementosPares(raiz);
    }

    private boolean existe(Nodo p, int x){
        if(p==null)
            return false;
        else{
            if(esHoja(p)){
                for(int i=1; i<p.M; i++){
                    if(p.getElem(i)==x)
                        return true;
                }
                return false;
            }
            else{
                int i = getHijoDesc(p, x);      //Busca en que hijo del arbol se encuentra el elemento

                if (i == -1)                    //Si el elemento ya existe
                    return true;
                else
                    return existe(p.getHijo(i),x);
            }
        }
    }
    
    private boolean existe1(Nodo p, int x){
        if(p==null)
            return false;
        else{
            if(esHoja(p)){
                for(int i=1; i<p.M; i++){
                    if(p.getElem(i)==x)
                        return true;
                }
                return false;
            }
            else{
                int j;
                //int i = getHijoDesc(p, x);      //Busca en que hijo del arbol se encuentra el elemento
                
                for(j = 1; j<p.M; j++){
                    if (x < p.getElem(j)) {
                        return existe1(p.getHijo(j),x);
                    }
                    if (x == p.getElem(j)) {
                        return true;
                    }
                }
                return existe1(p.getHijo(j),x);
                /*
                if (i == -1)                    //Si el elemento ya existe
                    return true;
                else
                    return existe(p.getHijo(i),x);
                        */
            }
        }
    }
    
    public boolean existe(int x){
        return existe(raiz, x);
    }
    
    private void mostrarElementosPares(Nodo p, JTextArea ta){
        if(p==null){
            return;
        }
        if(esHoja(p)){
            for(int i=1; i<=p.CantOcupados(); i++){
                if(p.getElem(i)%2==0)
                    ta.append(String.valueOf(p.getElem(i)+" "));
            }
        }
        else{
            for(int i=1; i<p.M;i++){
                if(p.getElem(i)%2==0)
                    ta.append(String.valueOf(p.getElem(i)+" "));
                mostrarElementosPares(p.getHijo(i), ta);
            }
            mostrarElementosPares(p.getHijo(p.M), ta);
        }
    }
    
    public void mostrarElementosPares(JTextArea ta){
        mostrarElementosPares(raiz, ta);
    }
    //EJERCICIO 1
    private int CantElementosPrimos(Nodo R){
        if(R==null)
            return 0;
        else{
            if(esHoja(R))
                return R.CantPrimos();
            else{
                int h=0;
                for(int i=1; i<=R.M; i++){
                    h = h+CantElementosPrimos(R.getHijo(i));
                }
                return h+R.CantPrimos();
            }
        }
    }
    
    public int CantElementosPrimos(){
        return CantElementosPrimos(raiz);
    }
    //FIN EJERCICIO 1
    
    //EJERCICIO 2
    private void mostrarSumaHijos(Nodo p, JTextArea ta){
        if(p==null || esHoja(p)){
            return;
        }
        else{
            ta.append("\nSuma de hijos\n");
            for(int i=1; i<=p.M;i++){
                ta.append("Hijo "+i+":     "+String.valueOf(sumarElementos(p.getHijo(i)))+"\n");
            }
        }
    }
    
    public void mostrarSumaHijos(JTextArea ta){
        mostrarSumaHijos(raiz, ta);
    }
    //FIN EJERCICIO 2
    
    //EJERCICIO 3
    private void mostrarMayorHijos(Nodo p, JTextArea ta){
        if(p==null || esHoja(p)){
            return;
        }
        else{
            ta.append("\nMayor de cada hijo\n");
            for(int i=1; i<=p.M;i++){
                ta.append("Hijo "+i+":     "+String.valueOf(p.getHijo(i).getElemMayor())+"\n");
            }
        }
    }
    
    public void mostrarMayorHijos(JTextArea ta){
        mostrarMayorHijos(raiz, ta);
    }
    //FIN EJERCICIO 3
    
    //EJERCICIO 4
    private int CantMayoresX(Nodo R, int x){
        if(R==null)
            return 0;
        else{
            if(esHoja(R))
                return R.CantElemMayorX(x);
            else{
                int h=0;
                for(int i=1; i<=R.M; i++){
                    h = h+CantMayoresX(R.getHijo(i),x);
                }
                return h+R.CantElemMayorX(x);
            }
        }
    }
    
    public int CantMayoresX(int x){
        return CantMayoresX(raiz, x);
    }
    //FIN EJERCICIO 4
    
    //EJERCICIO 5
    private void mostrarElementosPrimos(Nodo p, JTextArea ta){
        int k = 2;
        if(p==null){
            return;
        }
        if(esHoja(p)){
            for(int i=1; i<=p.CantOcupados(); i++){
                if(p.verificarPrimo(p.getElem(i),k))
                    ta.append(String.valueOf(p.getElem(i)+"  "));
            }
        }
        else{
            for(int i=1; i<p.M;i++){
                if(p.verificarPrimo(p.getElem(i),k))
                    ta.append(String.valueOf(p.getElem(i)+"  "));
                mostrarElementosPrimos(p.getHijo(i), ta);
            }
            mostrarElementosPrimos(p.getHijo(p.M), ta);
        }
    }
    
    public void mostrarElementosPrimos(JTextArea ta){
        mostrarElementosPrimos(raiz, ta);
    }
    //FIN EJERCICIO 5
}
//end class arbol
