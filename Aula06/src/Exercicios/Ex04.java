package Exercicios;

public class Ex04 {

    void somaparimpar() {
        int par = 0;        
        int impar = 0;
        
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                par = par + i;
                System.out.println(i + " + " + par + " par");
            }else{                
                impar = impar + i;
                System.out.println(i + " + " + impar + " impar");
            }
            
        }if(par > impar){
                System.out.println("par é maior");
            }else{
                
                System.out.println("impar é maior");
            }
    }
}
