

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a,b,c;
        double media;
        
        System.out.print("Digite os tres numeros: ");
        
        a =sc.nextInt();
        b =sc.nextInt();
        c =sc.nextInt();
        
        media = (a+b+c) / 3;
        
        System.out.println("A média aritmética é" + media);
        
        sc.close();
        
        
    }
}
