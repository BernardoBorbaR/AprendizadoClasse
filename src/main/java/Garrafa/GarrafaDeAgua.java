package Garrafa;

public class GarrafaDeAgua {
        String marca;
        int quantidade; //10
        void status(){
            System.out.println("Quantidade: "+quantidade+"ml");
        }
        int beber(int quantBeber){
            if(quantBeber>=0) {
                if (quantidade - quantBeber < 0) {
                    System.out.println("Não é possível, pois não tem quantidade o suficiente!!");
                    System.out.println("A quantidade que faltou é: " + (quantBeber - quantidade)); //quantBeber = 20
                    quantidade = 0;
                    return quantidade;
                }
                quantidade = quantidade - quantBeber;
                return quantidade;
            }
            System.out.println("Não tem como você beber menos que 0ml!!");
            status();
            return quantidade;
        }
        int encher(int quantEncher){
            if(quantEncher>=0) {
                if (quantidade + quantEncher > 500) {
                    System.out.println("Não é possível, pois se não transbordara a garrafa!!");
                    status();
                    return quantidade;
                }
                quantidade = quantidade + quantEncher;
                return quantidade;
            }
            System.out.println("Você não pode encher menos de 0ml!!");
            status();
            return quantidade;
        }
    }