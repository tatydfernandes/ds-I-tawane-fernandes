package Instancia;

import javax.swing.JOptionPane;



public class Funcao {

    void soma() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));

        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B"));

        int soma = a + b;
        
        JOptionPane.showInputDialog(null, "Sua soma é: " + soma);
    }

    void sub() {
        
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));

        int d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor D"));

        int subtracao = c - d;
        
        JOptionPane.showInputDialog(null, "Sua subtração é: " + subtracao);
    }
    
    void div() {
        
        int e = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de E"));

        int f = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor F"));

        int divisao = e / f;
        
        JOptionPane.showInputDialog(null, "Sua divisão é: " + divisao);
    }
    
    void multi() {
        
        int g = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de G"));

        int h = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor H"));

        int multi = g * h;
        
        JOptionPane.showInputDialog(null, "Sua multiplicação é: " + multi);
    }
}
