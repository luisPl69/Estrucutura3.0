package Materia;

import java.util.NoSuchElementException;
import Materia.Moders.Node;

public class Cola {

    private Node first;
    private Node last;

    public Cola (){
        this.first=null;
        this.last=null;

    }
    // metood para agregar un node

    public  void addNode(int value) {
        Node nuevoNodo = new Node(value);
        if(isEmpety()){
            first=nuevoNodo;
            last=nuevoNodo;

        }else{
            last.next=nuevoNodo;
            last=nuevoNodo;
        }
        
    }
    public int remove(){
        if(isEmpety()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        int value =first.value;
        first=first.next;
        if(first==null){
            last=null
        }
    }

    public int peek(){
        if(isEmpety()){
            throw new NoSuchElementException("La cola esta vacia")
        }
        return first.value;
        
    }
    public boolean isEmpety(){
        return first==null;
    }

    


}
