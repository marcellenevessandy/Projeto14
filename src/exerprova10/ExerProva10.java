package exerprova10;

import java.util.Scanner;

public class ExerProva10 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome;
        int quant;
        double valorUnit, tot, desc;

        System.out.println("Informe o nome do produto: ");
        nome = ler.nextLine();
        System.out.println("Informe o valor unitário: ");
        valorUnit = ler.nextDouble();
        System.out.println("Informe a quantidade: ");
        quant = ler.nextInt();
        
        tot = quant*valorUnit;
        
        if (quant <=0){
        desc = tot* (2.0/100.0);
        }else if (quant>5&&quant<=10){
        desc = tot*0.03;
        }else{
        desc = tot *0.05;
        }
        System.out.println("O valor total é R$"+tot);
        tot = tot - desc;
        System.out.println("O valor total menos o desconto é R$"+tot);
                
    }

}
