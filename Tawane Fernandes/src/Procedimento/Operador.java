package Procedimento;

import javax.swing.JOptionPane;

public class Operador {

    void soma(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        int soma = a + b;
        JOptionPane.showMessageDialog(null, "O valor da soma: " + soma);
    }
    void sobtracao(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        int subtracao = a - b;
        JOptionPane.showMessageDialog(null, "O valor da subtração: " + subtracao);
    }
    void divisao(){
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
        double divisao = a / b;
        JOptionPane.showMessageDialog(null, "O valor da divisão: " + divisao);
    }
    void multiplicacao(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        int multiplicacao = a * b;
        JOptionPane.showMessageDialog(null, "O valor da multiplicação: " + multiplicacao);
    }
}
