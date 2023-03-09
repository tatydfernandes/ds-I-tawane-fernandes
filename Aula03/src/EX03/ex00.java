
package EX03;

import javax.swing.JOptionPane;

public class ex00 {
    
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
        
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));
       
        if (a == b && b == c && a == c){
            System.out.println ("Equilátero");
        } else if (a == b) (b == c) (a == c) {
            System.out.println ("Isósceles");
        } else if (){
                System.out.println ("Escaleno");
    }
}

