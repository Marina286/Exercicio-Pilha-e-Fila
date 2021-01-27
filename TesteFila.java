package ed.pilha;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {
	public static void main(String[] args){
        Fila fila = new Fila();
        fila.adiciona("Marina"); 
        fila.adiciona("Feyre"); 
    
        System.out.println(fila);
        
        String m1 = fila.remove();
        System.out.println(m1);
        System.out.println(fila);
        
        Queue<String> filaDoJava = new LinkedList<String>();
        filaDoJava.add("Marina");
        String m2 = filaDoJava.poll();
        
        System.out.println(m2);
    }
}
