package Exercicios07;

public class Enquanto {
    public static void main(String[] args) {
        
        int i = 0;
        int par = 0;
        int impar = 0;
        
        while(i <= 10){
            if(i % 2 == 0){
                System.out.println(i + " é par");
                par = par + i;
            }else{
                System.out.println(i + " é ímpar");
                impar = impar + i;
            }
            i++;            
        }
        System.out.println(par);
        System.out.println(impar);
        if(par > impar){
            System.out.println("Par é maior");
        }else{
            System.out.println("ímpar é maior");
        }
    }
 
}
