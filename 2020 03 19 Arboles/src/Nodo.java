/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */

class Nodo
{
    private Nodo hijoIzq;
    private int elem;
    private Nodo hijoDer;
 
    public Nodo(int ele) {
            hijoIzq=null;
            elem = ele;
            hijoDer=null;
        }
        public void setHI(Nodo izq){
            hijoIzq = izq;
        }
        public void setElem(int e) {
            elem = e;
        }
        public void setHD(Nodo der) {
            hijoDer = der;
        }
        public Nodo getHI() {
            return hijoIzq;
        }
        public int getElem() {
            return elem;
        }
        public Nodo getHD() {
            return hijoDer;
        }

    }//end class