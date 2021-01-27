package ed.pilha;

import java.util.Stack;

public class TestePilha {
	public static void main(String[] args){
        Pilha pilha = new Pilha();
        pilha.push("Marina"); 
        
        System.out.println(pilha);
        pilha.push("Feyre");
        
        System.out.println(pilha);
        
        String r1 = pilha.pop();
        System.out.println(r1);
        
        String r2 = pilha.pop();
        System.out.println(r2);
        
        System.out.println(pilha.vazia());
        pilha.push("Rhysand");
        System.out.println(pilha.vazia());
        
        System.out.println(pilha);
        
        Stack<String> stack = new Stack<String>();
        stack.push("Marina");
        stack.push("Feyre");
        System.out.println(stack);
        System.out.println(stack.pop());
        
        String nome = stack.peek();
        System.out.println(nome);
    }
}
