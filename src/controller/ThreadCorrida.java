package controller;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadCorrida extends Thread {
    int sapo;

    private static final AtomicInteger colocoes = new AtomicInteger(0);

    public ThreadCorrida(int sapo) {
        this.sapo = sapo;
    }

    @Override
    public void run() {
        CorridaSapos();
    }

    private void CorridaSapos() {
        int posicao;
        int disMax = 10; //Metros
        int pulo = 0;
        int tamPulo = 0;

        do {
            pulo = (int) (Math.random() * 9) + 1;
            tamPulo += pulo;
            if (disMax - tamPulo > 0) {
                System.out.println("\nO Sapo " + sapo + " pulou " + pulo + " metros! faltam " + (disMax - tamPulo) + " metros");
            } else {
                System.out.println("\nO Sapo " + sapo + " Chegou! Após o pulo de " + pulo + " metros!");
            }
        } while (tamPulo < disMax);
        posicao = colocoes.incrementAndGet();

        try {
            sleep(2L * posicao);
            System.err.println("\nSapo " + sapo + " chegou em " + posicao + "° lugar!");
        } catch (Exception ignored) {

        }
    }
}
