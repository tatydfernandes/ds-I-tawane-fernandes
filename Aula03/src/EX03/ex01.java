package EX03;

import javax.swing.JOptionPane;

public class ex01 {

    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));

        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B"));

        int soma = a + b;

        JOptionPane.showInputDialog(null, "Sua soma é: " + soma);
            
    }
}
