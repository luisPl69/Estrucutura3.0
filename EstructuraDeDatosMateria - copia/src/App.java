import Materia.Cola;
import Materia.Moders.Pantalla;
import Materia.Moders.PilaGenerica;
import Materia.Moders.Pilas.Pila;

public class App {
    public static void main(String[] args) throws Exception {

        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        System.out.println("Elemento en  la cima de la pila: " + pila.peek());
        System.out.println("Elemento eliminado de la es: " + pila.pop());
        System.out.println("Elemento en  la cima de la pila: " + pila.peek());

        System.out.println();
        //implementacion de pila generica
        PilaGenerica<Pantalla> pilaPantallas = new PilaGenerica<>();
        pilaPantallas.push(new Pantalla("Home page", "/home"));
        pilaPantallas.push(new Pantalla("Menu Page", "/home/menu"));
        pilaPantallas.push(new Pantalla("Set page", "/home/menu/settings"));
        System.out.println("Estoy en la pantalla "+pilaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla "+pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla "+pilaPantallas.peek().getNombre());
        pilaPantallas.push(new Pantalla("User page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla \n\t "+pilaPantallas.peek().getNombre());

        //IMPLEMENTACION DE COLA GENERICCA TIPO PANTALLA

        Cola queue=new Cola();
        //Añadir elemto a la cola

        queue.addNode(10);
        queue.addNode(20);
        queue.addNode(30);

        //Mostrar elemtos al frente
        System.out.println("Elemtos en el frente: "+queue.peek());//10

        //Retira elementos de la cola 
        System.out.println("Elemento elilinado: "+queue.remove());//10
        System.out.println("Elemento en el frente: "+ queue.peek());//10

        System.out.println("Elemento eliminado; "+queue.remove());//20
        System.out.println("Elemnto en el frente:"+queue.peek());//10

        //Verifica si la cola esta vacia
        System.out.println("Cola vacia?"+(queue.isEmpety() ? "si":"No" ));






    }



    

}
