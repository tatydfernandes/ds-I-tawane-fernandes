
package Instancia;

import javax.swing.JOptionPane;

public class teste02 {
    
    public static void main(String[] args) {
    
     Funcao chamar = new Funcao();
     
 int op = Integer.parseInt(JOptionPane.showInputDialog ("Digite o operador"));
 
     if (op == 1) {
        chamar.soma();
    } else if (op == 2) {
        chamar.sub();
    } else if (op == 3) {
        chamar.div();
    } else if (op == 4) {
        chamar.multi();
    } else { 
      System.out.println("Valor inválido");
    }
    
} catch (Exception e) {
    JOptionPane.showInputDialog(null,"Valor inválido");)
  
}
}