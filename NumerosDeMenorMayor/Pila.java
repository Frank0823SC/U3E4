package NumerosDeMenorMayor;
public class Pila {
    Nodo cima;
    int tama;

    public Pila() {
        this.cima = null;
        this.tama = 0;
    }

    public boolean EstaVacia() {
        if(cima == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Agregar(int d) {
        Nodo nuevo = new Nodo(d);
        nuevo.sig = cima;
        cima = nuevo;
        tama++;
    }
    
    public void NumerosRandom(Pila yo, Pila tu){
        for(int i = 0; i < 10; i++){
            int ram = ((int) (Math.random() * 500) + 50);
            Insertar(yo, tu, ram);
        }
    } 
    
    public void Insertar(Pila yo, Pila tu, int d){
        if (yo.EstaVacia()) {
            yo.Agregar(d);
        }
        else{
            int cima = yo.Quitar();
            if (d >= cima) {
                yo.Agregar(cima);
                yo.Agregar(d);
            }
            else{
                yo.Agregar(cima);
                tu.Agregar(d);
            }
        }
    }

    public int Quitar() {
        int aux = cima.dato;
        cima = cima.sig;
        tama--;
        return aux;
    }

    public int Cima() {
        return cima.dato;
    }

    public int Tamanio() {
        return tama;
    }

    public void MostrarPila() {
        Nodo aux = cima;
        while (aux != null) {
            System.out.println("[" + aux.dato + "]");
            aux = aux.sig;
        }
        System.out.println("");
    } 
}
