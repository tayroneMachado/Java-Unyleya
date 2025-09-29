// 4 - Verificação de Expressões: No desenvolvimento de uma calculadora, você precisa verificar se a expressão matemática digitada está com os parênteses corretamente balanceados. Utilize uma pilha para desenvolver um programa que verifique essa estrutura, ajudando a identificar possíveis erros antes do cálculo. 

import java.util.Stack;

public class VerificacaoParenteses {
    public static void main(String[] args) {
        String expressao1 = "((A + B) * C)";
        String expressao2 = "((A + B) * C))";
        
        System.out.println("Expressão '" + expressao1 + "' está balanceada? " + verificarParenteses(expressao1));
        System.out.println("Expressão '" + expressao2 + "' está balanceada? " + verificarParenteses(expressao2));
    }

    public static boolean verificarParenteses(String expressao) {
        Stack<Character> pilha = new Stack<>();
        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }
}