package org.example;

import java.util.Scanner;

public class aula3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Digite a primeira nota: ");
        Double nota1 = ler.nextDouble();

        System.out.println("Digite a segunda nota: ");
        Double nota2 = ler.nextDouble();


        double media =(nota1 + nota2 )/2;


        if ( media >= 7){
            System.out.println("Parabéns" + nome +", você foi aprovado com " + media );
        }else if (media >=5 && media <=6.9){
            System.out.println( nome +", você está em verificação suplementar  com " + media);
        }else{
            System.out.println( nome+ "você foi reprovado com " +media);
        }



        ler.close();
    }
}
