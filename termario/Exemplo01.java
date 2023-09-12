package termario;

import java.util.Scanner;

public class Exemplo01 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, notaexame, media;
        int faltas;

        // entrada de dados 

        System.out.println("Insira sua primeira nota:");
        nota1 = teclado.nextDouble();
        System.out.println("Insira sua segunda nota:");
        nota2 = teclado.nextDouble();
        System.out.println("Digite suas faltas:");
        faltas = teclado.nextInt();

        // processamento

        if (faltas >= 16){
            System.out.println("Reprovado por faltas");
        }


        media = (nota1 + nota2) / 2;

        System.out.println("A média é:" + media);
        if (media >= 6){
            System.out.println("Parabens, aprovado");
        } else {
            System.out.println("Reprovado, informe a nota do exame:");
            notaexame = teclado.nextDouble();
            media = (media + notaexame) / 2;
            if (media >= 5){
                System.out.println("Aprovado pelo exame");
            } else{
                System.out.println("Reprovado ate no exame");
            }

        }
       teclado.close();

    }
}