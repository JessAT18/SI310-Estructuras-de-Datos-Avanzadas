/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
import javax.swing.JTextArea;

public class Arbol {

    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    private boolean esHoja(Nodo pr) {
        return pr.getHI() == null && pr.getHD() == null;
    }

    public void insertar(int x) {
        Nodo q = new Nodo(x);
        if (raiz == null) {
            raiz = q;
            return;
        }
        Nodo pr = raiz;
        Nodo ant = null;
        while (pr != null) {
            ant = pr;
            if (x < pr.getElem()) {
                pr = pr.getHI();
            } else if (x > pr.getElem()) {
                pr = pr.getHD();
            } else {
                return;
            }
        }
        if (x < ant.getElem()) {
            ant.setHI(q);
        } else {
            ant.setHD(q);
        }
    }

    private void preOrden(Nodo pr, JTextArea rt) {
        if (pr != null) {
            rt.append(String.valueOf(pr.getElem() + "  "));
            preOrden(pr.getHI(), rt);
            preOrden(pr.getHD(), rt);
        }
    }

    public void preOrden(JTextArea rt) {
        preOrden(raiz, rt);
    }

    private void InOrden(Nodo pr, JTextArea rt) {
        if (pr != null) {
            InOrden(pr.getHI(), rt);
            rt.append(String.valueOf(pr.getElem() + "  "));
            InOrden(pr.getHD(), rt);
        }
    }

    public void InOrden(JTextArea rt) {
        InOrden(raiz, rt);
    }

    private void PostOrden(Nodo pr, JTextArea rt) {
        if (pr != null) {
            PostOrden(pr.getHI(), rt);
            PostOrden(pr.getHD(), rt);
            rt.append(String.valueOf(pr.getElem() + "  "));
        }
    }

    public void PostOrden(JTextArea rt) {
        PostOrden(raiz, rt);
    }

    private int suma(Nodo pr) {
        if (pr == null) {
            return 0;
        } else if (esHoja(pr)) // no es necesario
        {
            return pr.getElem();
        } else {
            int hi = suma(pr.getHI());
            int hd = suma(pr.getHD());

            return hi + hd + pr.getElem();
        }
    }

    public int suma() {
        return suma(raiz);
    }

    private int sumaPares(Nodo pr) {
        if (pr == null) {
            return 0;
        } else if (esHoja(pr)) // no es necesario
        {
            return (pr.getElem() % 2 == 0) ? pr.getElem() : 0;
        } else {
            int hi = sumaPares(pr.getHI());
            int hd = sumaPares(pr.getHD());

            return hi + hd + ((pr.getElem() % 2 == 0) ? pr.getElem() : 0);
        }
    }

    public int sumaPares() {
        return sumaPares(raiz);
    }

    private int contarPares(Nodo pr) {
        if (pr == null) {
            return 0;
        } else if (esHoja(pr)) // no es necesario
        {
            return (pr.getElem() % 2 == 0) ? 1 : 0;
        } else {
            int hi = contarPares(pr.getHI());
            int hd = contarPares(pr.getHD());

            return hi + hd + ((pr.getElem() % 2 == 0) ? 1 : 0);
        }
    }

    public int contarPares() {
        return contarPares(raiz);
    }

    private int altura(Nodo pr) //Ver cuantos niveles o pisos tiene el arbol
    {
        if (pr == null) {
            return 0;
        } else if (esHoja(pr)) // no es necesario // Si tiene un elemento
        {
            return 1;
        } else {
            int ai = altura(pr.getHI());
            int ad = altura(pr.getHD());
            if (ai < ad) //Evalua la rama mas larga
            {
                return ad + 1;
            } else {
                return ai + 1;
            }
        }
    }

    public int altura() {
        return altura(raiz);
    }

    private int menor(Nodo pr) //Devuelve el menor elemento del arbol
    {
        if (pr == null) {
            return 0;
        } else if (esHoja(pr)) // Si tiene un elemento
        {
            return pr.getElem();
        } else {
            return menor(pr.getHI()); //Basta con recorrer la rama izquierda

        }
    }

    public int menor() {
        return menor(raiz);
    }

    //PREGUNTA 1
    private boolean existe(Nodo pr, int x) {
        if (pr == null) {
            return false;
        } else {
            boolean ai = existe(pr.getHI(), x);
            boolean ad = existe(pr.getHD(), x);
            if (ai || ad) {
                return true;
            } else {
                return pr.getElem() == x;
            }
        }
    }

    public boolean existe(int x) {
        return existe(raiz, x);
    }

    private boolean incompleto(Nodo T) {
        return (T.getHD() != null && T.getHI() == null) || (T.getHD() == null && T.getHI() != null);
    }

    private boolean brother(Nodo p, int x, int y) {
        if (p == null) {
            return false;
        } else if (esHoja(p) || incompleto(p)) {
            return false;
        } else {
            if (brother(p.getHI(), x, y) || brother(p.getHD(), x, y)) {
                return true;
            } else {  //Para la forma como ingrese los hnos
                if (p.getHI().getElem() == x && p.getHD().getElem() == y || p.getHI().getElem() == y && p.getHD().getElem() == x) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    public boolean sonHermanos(int x, int y) {
        return brother(raiz, x, y);
    }

    private int incompletos(Nodo pr) {
        if (pr == null) {
            return 0;
        } else if (esHoja(pr)) //no es necesario
        {
            return 0;
        } else {
            int hi = incompletos(pr.getHI());
            int hd = incompletos(pr.getHD());
            if (pr.getHI() != null && pr.getHD() == null || pr.getHI() == null && pr.getHD() != null) {
                return hi + 1;
            } else {
                return hd + 1;
            }
        }
    }

    public int contarIncompletos() {
        return incompletos(raiz);
    }

    private void mostrarPares(Nodo pr, JTextArea rt) {
        if (pr == null) {
            return;
        } else if (esHoja(pr)) {
            if (pr.getElem() % 2 == 0) {
                rt.append(pr.getElem() + " ");
            }
        } else {
            mostrarPares(pr.getHI(), rt);
            mostrarPares(pr.getHD(), rt);
            if (pr.getElem() % 2 == 0) {
                rt.append(pr.getElem() + " ");
            }
        }
    }

    public void mostrarPares(JTextArea rt) {
        mostrarPares(raiz, rt);
    }

              //PREGUNTA 5
    private int cantHojas(Nodo pr) {
        if (pr == null) {
            return 0;
        } else {
            int hi = cantHojas(pr.getHI());
            int hd = cantHojas(pr.getHI());
            if (pr.getHI() == null && pr.getHD() == null) {
                return hi + hd + 1;
            } else {
                return hi + hd;
            }
        }
    }

    public int cantHojas() {
        return cantHojas(raiz);
    }

    //CLASE 2020-04-16

    private boolean esSuHijo(Nodo pr, int hijo) {
        if (pr == null) {
            return false;
        }
        if (!esHoja(pr)) {
            if (pr.getHD() != null && pr.getHD().getElem() == hijo) {
                return true;
            }
            if (pr.getHI() != null && pr.getHI().getElem() == hijo) {
                return true;
            }
        }
        return false;
    }

    private int retornaAbuelo(Nodo pr, int x) {
        
        if (pr == null) 
            return 0;
        
        if (altura(pr) >= 3) {
            if (pr.getHI() != null && esSuHijo(pr.getHI(), x))
                return pr.getElem();
            
            if (pr.getHD() != null && esSuHijo(pr.getHD(), x)) 
                return pr.getElem();
            
        }
        int ai = retornaAbuelo(pr.getHI(), x);
        int ad = retornaAbuelo(pr.getHD(), x);
        
        if (ai != 0) 
            return ai;
    
        else 
            if (ad != 0) 
                return ad;
            else
                return 0;
    }
    
    public int retornaAbuelo(int x){
        return retornaAbuelo(raiz,x);
    }
    
}//end class
