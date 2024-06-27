package org.introducao.tadNumero_01;

import java.util.Scanner;

public class TadNumeroMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        TadNumero numero = new TadNumero();

        while (true) {
            System.out.println("=================================================================");
            System.out.println("                       Estudo do TAD Numero                      ");
            System.out.println("=================================================================");
            System.out.println("0 - Encerrar");
            System.out.println("1 - Ler valor");
            System.out.println("2 - Atribuir Valor");

            System.out.print("Qual sua opção ? ");

            int opcao = scan.nextInt();

            if (opcao == 0) {
                break;
            } else if (opcao == 1) {
                System.out.println(numero.getValor());
            } else if (opcao == 2) {
                System.out.println("Forneça o novo valor: ");
                int valor = scan.nextInt();
                numero.setValor(valor);
            }
        }

        scan.close();
    }
}
