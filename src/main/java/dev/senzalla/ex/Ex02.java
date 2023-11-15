package dev.senzalla.ex;

public class Ex02 {
    public void construirMatriz() {
        int[][] matriz = new int[2][3];
        System.out.println("Digite 6 números para compor a matriz:");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                matriz[linha][coluna] = new java.util.Scanner(System.in).nextInt();
            }
        }
        System.out.println(matriz[1][1]);
    }
}