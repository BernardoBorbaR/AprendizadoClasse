package Garrafa;

import java.util.Scanner;

public class Objeto {
    public static void main(String [] args){
        GarrafaDeAgua Bottle = new GarrafaDeAgua();
        Scanner ler = new Scanner(System.in);
        Bottle.marca = "Stanley";
        Bottle.quantidade = 500;
        int escolha=0;
        int quantBeber=0;
        int quantEncher=0;
        boolean continuar=true;
        while(continuar) {
            escolha = 0;
            while(escolha > 4 || escolha < 1) {
                System.out.println("Escolha: \n 1- Beber\n 2- Encher\n 3- Status\n 4- Parar\n");
                escolha = ler.nextInt();
            }
            switch (escolha) {
                case 1 -> {
                    System.out.println("Quanto você quer beber: ");
                    quantBeber = ler.nextInt();
                    Bottle.beber(quantBeber);
                }
                case 2 -> {
                    System.out.println("Quanto você quer encher: ");
                    quantEncher = ler.nextInt();
                    Bottle.encher(quantEncher);
                }
                case 3 -> {
                    Bottle.status();
                }
                case 4 -> {
                    continuar = false;
                }
            }
        }
    }
}