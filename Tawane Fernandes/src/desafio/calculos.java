package desafio;

import javax.swing.JOptionPane;

public class calculos {

    void quadrado() {

        try {

            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a"));

            if (a > 0) {

                int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b"));
                if (b > 0) {
                    int area = a * b;
                    if (a == b) {

                        System.out.println("A área do quadrado é:" + area);
                    } else {
                        System.out.println("A área do retangulo é:" + area);
                    }
                } else {
                    System.out.println("Valor inválido");
                }
            } else {
                System.out.println("Valor inválido");
            }

        } catch (Exception e) {
            System.out.println("Valores inválidos");
        }
    }

    void retangulo() {

        try {

            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a"));

            if (a > 0) {

                int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b"));
                if (b > 0) {
                    int area = a * b;
                    if (a == b) {
                        System.out.println("A área do quadrado é:" + area);
                    } else {
                        System.out.println("A área do retangulo é:" + area);
                    }
                } else {
                    System.out.println("Valor inválido");
                }
            } else {
                System.out.println("Valor inválido");
            }

        } catch (Exception e) {
            System.out.println("Valores inválidos");
        }
    }

    void triangulo() {
        
        try{

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b"));
        int area = a * b / 2;

        System.out.println("A área do triangulo é:" + area);
        }catch(Exception e){
            System.out.println("Valores inválidos");
        }

    }
}
