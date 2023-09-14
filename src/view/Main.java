package view;

import controller.ThreadCorrida;

public class Main {

    public static void main(String[] args) {
        System.out.println("====================================\nInicio da corrida!\n");
        for (int sapo = 1; sapo <= 5; sapo++) {
            Thread corrida = new ThreadCorrida(sapo);
            corrida.start();
        }

    }
}
