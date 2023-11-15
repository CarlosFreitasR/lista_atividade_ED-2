package dev.senzalla.ex;

public class Ex09 {
    public void mergeSort() {
        System.out.println("Demonstre o passo a passo da ordenação do vetor a abaixo utilizando o método Merge Sort.");
        System.out.println("[3][2][5][8][7][4]");
        System.out.println("[3][2][5] [8][7][4]");
        System.out.println("[3][2] [5] [8][7] [4]");
        System.out.println("[3] [2] [5] [8] [7] [4]");
        System.out.println("[3]<-[2] [5] [8] [4]<-[7]");
        System.out.println("[2][3] [5] [7][8] [4]");
        System.out.println("[2][3] [5] [7][8]<--[4]");
        System.out.println("[2][3] [5]->[4] [7][8]");
        System.out.println("[2][3][4][5][7][8]");
    }
}
