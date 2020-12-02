package NumerosDeMenorMayor;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
       
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        int opcion, dato;
        Pila yo = new Pila();
        Pila tu = new Pila();
        Pila el = new Pila();
        
        while(continuar){
            System.out.println("");
            System.out.println("*********************************************");
            System.out.println("********************Menú*********************");
            System.out.println("****1.- Insertar                         ****");
            System.out.println("****2.- Eliminar                         ****");
            System.out.println("****3.- Mostrar cima                     ****");            
            System.out.println("****4.- Generar numeros random           ****");
            System.out.println("****5.- Mostrar si la pila esta vacía    ****");
            System.out.println("****6.- Mostrar pila                     ****");
            System.out.println("****7.- Mostrar tamaño de la pila        ****");
            System.out.println("****8.- Salir                            ****");
            System.out.println("*********************************************");
            System.out.println("*********************************************");            
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1 ->{
                    System.out.println("Ingrese un numero");
                    dato = leer.nextInt();
                    el.Insertar(yo, tu, dato);
                }      
                case 2 ->{                    
                    if (!yo.EstaVacia()) {
                    System.out.println("Numero elimidado: " + yo.Quitar());
                    }
                    else{
                    System.out.println("La pila esta vacia");
                    }
                }
                case 3 ->{                    
                    if (!yo.EstaVacia()) {
                    System.out.println("Ultimo numero agregado: " + yo.Cima());
                    }
                    else{
                    System.out.println("La pila esta vacia");
                    }
                }
                case 4 ->{
                    el.NumerosRandom(yo, tu);
                    System.out.println("Numeros random generados");
                }
                case 5 ->{
                    if (yo.EstaVacia()){
                    System.out.println("La pila esta vacia");
                    }
                    else{
                    System.out.println("La pila tiene " + yo.Tamanio());
                    }
                }
                case 6 ->{
                    if (!yo.EstaVacia()) {
                    System.out.println("Pila 1: ");
                    yo.MostrarPila();
                    System.out.println("\nPila 2: ");
                    tu.MostrarPila();
                    }
                    else{
                    System.out.println("La pila esta vacia");
                    }
                }
                case 7 ->{
                    System.out.println("Tamaño de la pila: " + yo.Tamanio());
                }
                case 8 -> continuar = false;
                default -> System.out.println("Opción incorrecta.....Vuelve a intentarlo");
            }
        }
    }
}
