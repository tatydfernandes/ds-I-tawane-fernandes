
package Aula02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        double a = x.nextDouble();
        
        System.out.println("Digite o valor de B: ");
        double b = x.nextDouble();
        
        double soma = a + b;
        System.out.println("O valor da soma é: " + soma);
        
        double divisao = a / b;
        System.out.println("O valor da divisao é: "+ divisao);
    }
}
